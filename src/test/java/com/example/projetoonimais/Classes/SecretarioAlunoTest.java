package com.example.projetoonimais.Classes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.EnumSet;

class SecretarioAlunoTest {

    private SecretarioAluno secretarioAluno;
    private Aluno aluno1;
    private Aluno aluno2;

    @BeforeEach
    void setUp() {
        secretarioAluno = new SecretarioAluno("000000", "Secretário", 30, "secretario@email.com", "99999999", "Rua X");

        aluno1 = new Aluno("123", "Aluno 1", 20, "a1@email.com", "123456", "Rua A");
        aluno2 = new Aluno("456", "Aluno 2", 22, "a2@email.com", "654321", "Rua B");

        aluno1.setDiasSelecionados(EnumSet.of(Dias.SEGUNDA, Dias.TERCA));
        aluno2.setDiasSelecionados(EnumSet.of(Dias.SEGUNDA, Dias.QUARTA));

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        secretarioAluno.alocarAluno(listaAlunos);
    }

    @Test
    void testVerificarPresencaSegunda() {
        secretarioAluno.verificarPresenca(Dias.SEGUNDA);

    }

    @Test
    void testVerificarPresencaTerca() {
        secretarioAluno.verificarPresenca(Dias.TERCA);

    }

}