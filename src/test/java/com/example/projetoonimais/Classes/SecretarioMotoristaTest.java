package com.example.projetoonimais.Classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SecretarioMotoristaTest {

    private SecretarioMotorista secretario;
    private ArrayList<Motorista> listaMotoristas;

    @BeforeEach
    public void setUp() {
        secretario = new SecretarioMotorista();
        listaMotoristas = new ArrayList<>();

        // Motoristas com dados iniciais fictícios
        Motorista motorista1 = new Motorista("111111111", "Carlos", 45, "carlos@teste.com", "99999999", "Rua 1", 123456);
        Motorista motorista2 = new Motorista("222222222", "Ana", 38, "ana@teste.com", "88888888", "Rua 2", 654321);

        listaMotoristas.add(motorista1);
        listaMotoristas.add(motorista2);

        // Chama o método que altera os dados
        secretario.alocarMotorista(listaMotoristas);
    }

    @Test
    public void testAlocarMotorista_AtualizaDadosCorretamente() {
        for (Motorista motorista : listaMotoristas) {
            assertEquals("Robertão", motorista.getNome());
            assertEquals(12, motorista.getIdade());
            assertEquals("1232430240", motorista.getCPF());
            assertEquals("fldfalkfs@gmaiskfskf", motorista.getEmail());
            assertEquals("40028922", motorista.getTelefone());
            assertEquals("Rua 143424", motorista.getEndereco());
            assertEquals(131321, motorista.getCNH());
        }
    }
}
