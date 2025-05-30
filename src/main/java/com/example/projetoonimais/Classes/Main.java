package com.example.projetoonimais.Classes;

import java.util.ArrayList;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {

        // Criação de alunos
        EnumSet<Dias> diasAluno1 = EnumSet.of(Dias.SEGUNDA, Dias.QUARTA);
        EnumSet<Dias> diasAluno2 = EnumSet.of(Dias.TERCA, Dias.QUINTA, Dias.SEXTA);

        Aluno aluno1 = new Aluno("12345678900", "Maria", 20, "maria@email.com", "123456789", "Rua A", "Unifip", diasAluno1);
        Aluno aluno2 = new Aluno("98765432100", "João", 22, "joao@email.com", "987654321", "Rua B", "Unifip", diasAluno2);

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        // Criação do secretário de alunos
        SecretarioAluno secretarioAluno = new SecretarioAluno("11111111111", "Carlos", 30, "sec@email.com", "000000000", "Rua C");
        secretarioAluno.alocarAluno(listaAlunos);

        // Verificar presença na TERÇA
        secretarioAluno.verificarPresenca(Dias.TERCA);
        secretarioAluno.listarIten(); // Lista os alunos

        // Criação de motoristas
        Motorista motorista1 = new Motorista("22222222222", "Pedro", 45, "pedro@email.com", "111111111", "Rua D", 123456, 111111111);
        Motorista motorista2 = new Motorista("33333333333", "Ana", 38, "ana@email.com", "222222222", "Rua E", 654321, 222222222);

        ArrayList<Motorista> listaMotoristas = new ArrayList<>();
        listaMotoristas.add(motorista1);
        listaMotoristas.add(motorista2);

        // Criação do secretário de motoristas
        SecretarioMotorista secretarioMotorista = new SecretarioMotorista();
        secretarioMotorista.alocarMotorista(listaMotoristas);
        secretarioMotorista.listarIten();

        // Criação de ônibus
        Onibus onibus1 = new Onibus();
        Onibus onibus2 = new Onibus();

        ArrayList<Onibus> listaOnibus = new ArrayList<>();
        listaOnibus.add(onibus1);
        listaOnibus.add(onibus2);

        // Criação do secretário de ônibus
        SecretarioOnibus secretarioOnibus = new SecretarioOnibus();
        secretarioOnibus.alocarOnibus(listaOnibus);
        secretarioOnibus.verificarDados();
    }

}
