package com.example.projetoonimais.Classes;

import com.example.projetoonimais.Classes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.*;

public class SecretarioAlunoTest {

    private SecretarioAluno secretario;
    private ArrayList<Aluno> listaAlunos;

    @BeforeEach
    public void setUp() {
        secretario = new SecretarioAluno("000", "Secretário", 30, "sec@teste.com", "000000", "Rua A");
        listaAlunos = new ArrayList<>();

        // Aluno 1 segunda e quarta
        Aluno aluno1 = new Aluno("123", "João", 20, "joao@teste.com", "111", "Rua 1", "Unifip", EnumSet.of(Dias.SEGUNDA, Dias.QUARTA));
        // Aluno 2 somente quarta
        Aluno aluno2 = new Aluno("456", "Maria", 22, "maria@teste.com", "222", "Rua 2", "Unifip", EnumSet.of(Dias.QUARTA));
        // Aluno 3 presente terça
        Aluno aluno3 = new Aluno("789", "Pedro", 23, "pedro@teste.com", "333", "Rua 3", "Unifip", EnumSet.of(Dias.TERCA));

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

        secretario.alocarAluno(listaAlunos);
    }

    @Test
    public void testVerificarPresenca_QuartaFeira() {
        secretario.verificarPresenca(Dias.QUARTA);

        // como a1 e a2 tem quarta, o total de quarta deve ser 2
        assertEquals(2, getPrivateStaticField("totalAlunosQua"));
    }

    @Test
    public void testVerificarPresenca_SegundaFeira() {
        secretario.verificarPresenca(Dias.SEGUNDA);

        // Apenas aluno1 tem segunda
        assertEquals(1, getPrivateStaticField("totalAlunosSeg"));
    }

    @Test
    public void testVerificarPresenca_TercaFeira() {
        secretario.verificarPresenca(Dias.TERCA);

        // Apenas aluno3 tem terça
        assertEquals(1, getPrivateStaticField("totalAlunosTer"));
    }

    // Método utilitário para acessar os campos estáticos privados (por reflexão)
    private int getPrivateStaticField(String fieldName) {
        try {
            var field = SecretarioAluno.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.getInt(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
