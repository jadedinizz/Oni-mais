
package com.example.projetoonimais.Classes;

import com.example.projetoonimais.Exceptions.*;

import java.util.ArrayList;
import java.util.EnumSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Lista para armazenar os dados que serão escritos no arquivo
        ArrayList<String> dadosParaArquivo = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        dadosParaArquivo.add("Relatório do Sistema de Transporte");
        dadosParaArquivo.add("====================================");
        dadosParaArquivo.add("Início da execução: " + LocalDateTime.now().format(formatter));
        dadosParaArquivo.add("");

        try {
            // Criação dos dias de atendimento dos alunos
            EnumSet<Dias> diasAluno1 = EnumSet.of(Dias.SEGUNDA, Dias.QUARTA);
            EnumSet<Dias> diasAluno2 = EnumSet.of(Dias.TERCA, Dias.QUINTA, Dias.SEXTA);

            // Validação dos documentos dos alunos
            if (!validarCPF("12345678900")) {
                throw new CpfException("CPF do aluno 1 é inválido");
            }
            if (!validarCPF("98765432100")) {
                throw new CpfException("CPF do aluno 2 é inválido");
            }

            // Criação dos alunos
            Aluno aluno1 = new Aluno("12345678900", "Maria", 20, "maria@email.com", "123456789", "Rua A", "Unifip", diasAluno1);
            Aluno aluno2 = new Aluno("98765432100", "João", 22, "joao@email.com", "987654321", "Rua B", "Unifip", diasAluno2);
            dadosParaArquivo.add("Alunos criados:");
            dadosParaArquivo.add("- " + aluno1.getNome() + " (CPF: " + aluno1.getCpf() + ")");
            dadosParaArquivo.add("- " + aluno2.getNome() + " (CPF: " + aluno2.getCpf() + ")");
            dadosParaArquivo.add("");

            ArrayList<Aluno> listaAlunos = new ArrayList<>();
            listaAlunos.add(aluno1);
            listaAlunos.add(aluno2);


            if (!validarCPF("11111111111")) {
                throw new CpfException("CPF do secretário é inválido");
            }
            // Criação do secretário de alunos
            SecretarioAluno secretarioAluno = new SecretarioAluno("11111111111", "Carlos", 30, "sec@email.com", "454584818", "Rua C");
            dadosParaArquivo.add("Secretário de alunos: " + secretarioAluno.getNome());
            dadosParaArquivo.add("");

            if (listaAlunos.isEmpty()) {
                throw new StudentException("Nenhum aluno disponível para alocação");
            }
            secretarioAluno.alocarAluno(listaAlunos);
            dadosParaArquivo.add("Alunos alocados com sucesso");
            dadosParaArquivo.add("");

            // Verificação de presença
            secretarioAluno.verificarPresenca(Dias.TERCA);
            secretarioAluno.listarIten();
            dadosParaArquivo.add("Verificação de presença realizada para terça-feira");
            dadosParaArquivo.add("");

            // Criação dos motoristas
            if (!validarCNH(123456)) {
                throw new CnhException("CNH do motorista 1 é inválida");
            }
            if (!validarCNH(654321)) {
                throw new CnhException("CNH do motorista 2 é inválida");
            }

            Motorista motorista1 = new Motorista("12345678910", "Pedro", 45, "pedro@email.com", "400289221", "Rua D", 123456);
            Motorista motorista2 = new Motorista("11121314151", "Ana", 38, "ana@email.com", "122982004", "Rua E", 654321);
            dadosParaArquivo.add("Motoristas registrados:");
            dadosParaArquivo.add("- " + motorista1.getNome() + " (CNH: " + motorista1.getCNH() + ")");
            dadosParaArquivo.add("- " + motorista2.getNome() + " (CNH: " + motorista2.getCNH() + ")");
            dadosParaArquivo.add("");

            ArrayList<Motorista> listaMotoristas = new ArrayList<>();
            listaMotoristas.add(motorista1);
            listaMotoristas.add(motorista2);

            // Alocação de motoristas
            SecretarioMotorista secretarioMotorista = new SecretarioMotorista();
            if (listaMotoristas.isEmpty()) {
                throw new DriverException("Nenhum motorista disponível para alocação");
            }
            secretarioMotorista.alocarMotorista(listaMotoristas);
            secretarioMotorista.listarIten();
            dadosParaArquivo.add("Motoristas alocados com sucesso");
            dadosParaArquivo.add("");

            // Criação dos ônibus
            Onibus onibus1 = new Onibus(12, "ads32", 13, false);
            Onibus onibus2 = new Onibus(14,"sds32", 32, false);
            dadosParaArquivo.add("Ônibus registrados: 2 veículos");
            dadosParaArquivo.add("");

            ArrayList<Onibus> listaOnibus = new ArrayList<>();
            listaOnibus.add(onibus1);
            listaOnibus.add(onibus2);

            // Alocação de ônibus
            SecretarioOnibus secretarioOnibus = new SecretarioOnibus();
            if (listaOnibus.isEmpty()) {
                throw new BusException("Nenhum ônibus disponível para alocação");
            }
            secretarioOnibus.alocarOnibus(listaOnibus);
            secretarioOnibus.verificarDados();
            dadosParaArquivo.add("Ônibus alocados com sucesso");
            dadosParaArquivo.add("");

            dadosParaArquivo.add("Todas as operações foram concluídas com sucesso!");

        } catch (IllegalArgumentException e) {
            dadosParaArquivo.add("ERRO DE VALIDAÇÃO: " + e.getMessage());
            System.err.println("Erro de validação: " + e.getMessage());
        } catch (InvalidException e) {
            dadosParaArquivo.add("ERRO DE ESTADO: " + e.getMessage());
            System.err.println("Erro de estado do sistema: " + e.getMessage());
        } catch (Exception e) {
            dadosParaArquivo.add("ERRO INESPERADO: " + e.getMessage());
            System.err.println("Erro não previsto: " + e.getMessage());
            e.printStackTrace();
        } finally {
            dadosParaArquivo.add("");
            dadosParaArquivo.add("====================================");
            dadosParaArquivo.add("Fim da execução: " + LocalDateTime.now().format(formatter));

            // Escrever no arquivo
            Arquivos.escreverEmArquivo("relatorio_transporte.txt", dadosParaArquivo);
            System.out.println("Processo concluído. Verifique o arquivo relatorio_transporte.txt");
        }
    }

    private static boolean validarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        // Lógica completa de validação de CPF
        return true;
    }

    private static boolean validarCNH(int cnh) {
        return cnh > 0;
    }


}