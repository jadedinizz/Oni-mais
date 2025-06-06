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
    private ArrayList<Aluno> alunos = new ArrayList<>();
    protected EnumSet<Dias> diasSelecionados = EnumSet.noneOf(Dias.class);


    public SecretarioAluno(String CPF, String nome, int idade, String email, String telefone, String endereco) {
        super(CPF, nome, idade, email, telefone, endereco);
    }

    public void verificarPresenca(Dias diaAtual){

        for (Aluno a: alunos){
            EnumSet<Dias> diasSelecionados = a.getDiasSelecionados();

            if (diaAtual == Dias.SEGUNDA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosSeg++;
                }
            } if (diaAtual == Dias.TERCA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosTer++;
                }
            } if (diaAtual == Dias.QUARTA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosQua++;
                }
            } if (diaAtual == Dias.QUINTA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosQui++;
                }
            } if (diaAtual == Dias.SEXTA) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosSex++;
                }
            } if (diaAtual == Dias.SABADO) {
                if (diasSelecionados.contains(diaAtual)) { // Ele vai verificar a presença do dia, que ele botou
                    totalAlunosSab++;
                }
            }
        }
    }


    public void alocarAluno(ArrayList<Aluno> aluno) {
        this.alunos = aluno;

        for (Aluno a : this.alunos){
            a.getNome();
            a.getCPF();
            a.getNome();
            a.getTelefone();
            a.getEndereco();
        }
    }

    // Implementacao

    @Override
    public void listarIten() {
        System.out.println("Dados alunos: ");
        for (Aluno a : alunos){
            System.out.println(a.getNome());
            System.out.println(a.getEmail());
            System.out.println(a.getCPF());
            System.out.println(a.instituicao);
            System.out.println(a.endereco);
            System.out.println(a.getTelefone());

        }
    }

    @Override
    public void verificarDados() {
        System.out.println("Dados alunos: ");
        for (Aluno a : alunos){
            System.out.println(a.getNome());
            System.out.println(a.getCPF());
            System.out.println(a.getEmail());
            System.out.println(a.getTelefone());
            System.out.println(a.endereco);
            System.out.println(a.instituicao);

        }
        // Printar dados dos alunos
    }
}
