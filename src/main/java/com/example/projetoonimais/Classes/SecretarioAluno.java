package com.example.projetoonimais.Classes;

import java.util.ArrayList;
import java.util.EnumSet;

public class SecretarioAluno extends Pessoa implements SecretarioInterface {

    private static int totalAlunosCadastrados = 0;
    private static int totalAlunosSeg = 0;
    private static int totalAlunosTer = 0;
    private static int totalAlunosQua = 0;
    private static int totalAlunosQui = 0;
    private static int totalAlunosSex = 0;
    private static int totalAlunosSab = 0;

    private static ArrayList<Aluno> alunos = new ArrayList<>(); // agora é static
    protected EnumSet<Dias> diasSelecionados = EnumSet.noneOf(Dias.class);

    public SecretarioAluno(String CPF, String nome, int idade, String email, String telefone, String endereco) {
        super(CPF, nome, idade, email, telefone, endereco);
    }

    public void verificarPresenca(Dias diaAtual) {
        for (Aluno a : alunos) {
            EnumSet<Dias> diasSelecionados = a.getDiasSelecionados();
            if (diasSelecionados.contains(diaAtual)) {
                switch (diaAtual) {
                    case SEGUNDA -> totalAlunosSeg++;
                    case TERCA -> totalAlunosTer++;
                    case QUARTA -> totalAlunosQua++;
                    case QUINTA -> totalAlunosQui++;
                    case SEXTA -> totalAlunosSex++;
                    case SABADO -> totalAlunosSab++;
                }
            }
        }
    }

    public void alocarAluno(ArrayList<Aluno> novosAlunos) {
        alunos = novosAlunos;
    }

    public static void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        totalAlunosCadastrados++;
    }

    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    // Implementação da interface
    @Override
    public void listarIten() {
        System.out.println("Dados dos alunos:");
        for (Aluno a : alunos) {
            System.out.println(a.getNome());
            System.out.println(a.getEmail());
            System.out.println(a.getCpf());
            System.out.println(a.getInstituicao());
            System.out.println(a.endereco);
            System.out.println(a.getTelefone());
        }
    }

    @Override
    public void verificarDados() {
        System.out.println("Verificação de dados dos alunos:");
        for (Aluno a : alunos) {
            System.out.println(a.getNome());
            System.out.println(a.getCpf());
            System.out.println(a.getEmail());
            System.out.println(a.getTelefone());
            System.out.println(a.endereco);
            System.out.println(a.getInstituicao());
        }
    }
}
