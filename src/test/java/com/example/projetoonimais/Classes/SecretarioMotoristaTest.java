package com.example.projetoonimais.Classes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class SecretarioMotoristaTest {

        private SecretarioMotorista secretarioMotorista;
        private Motorista motorista1;
        private Motorista motorista2;

        @BeforeEach
        void setUp() {
            secretarioMotorista = new SecretarioMotorista();
            motorista1 = new Motorista();
            motorista2 = new Motorista();

            ArrayList<Motorista> lista = new ArrayList<>();
            lista.add(motorista1);
            lista.add(motorista2);

            secretarioMotorista.alocarMotorista(lista);
        }

        @Test
        void testAlocarMotoristaPreencheDados() {
            assertEquals("Robertão", motorista1.getNome());
            assertEquals(12, motorista1.getIdade());
            assertEquals("40028922", motorista1.getTelefone());
            assertEquals("1232430240", motorista1.getCPF());
            assertEquals(131321, motorista1.getCNH());
            assertEquals("fldfalkfs@gmaiskfskf", motorista1.getEmail());
            assertEquals("Rua 143424", motorista1.getEndereco());

            // Repete para o segundo
            assertEquals("Robertão", motorista2.getNome());
        }

}