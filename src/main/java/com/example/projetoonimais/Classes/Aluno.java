package com.example.projetoonimais.Classes;

import com.example.projetoonimais.Exceptions.CpfException;

import java.util.EnumSet;

public class Aluno extends Pessoa {
    protected String instituicao;
    protected EnumSet<Dias> diasSelecionados;

    public Aluno(String CPF, String nome, int idade, String email, String telefone, String endereco, String instituicao, EnumSet<Dias> diasSelecionados) {
        super(CPF, nome, idade, email, telefone, endereco);
        this.instituicao = instituicao;
        this.diasSelecionados = diasSelecionados;
    }

    public void setDiasSelecionados(EnumSet<Dias> diasSelecionados) {
        this.diasSelecionados = diasSelecionados;
    }

    public EnumSet<Dias> getDiasSelecionados() {
        return diasSelecionados;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void adicionarDia(Dias diaDeAula){
        diasSelecionados.add(diaDeAula);
    }

    public void contemLetras(String texto) throws CpfException {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                if (texto.length() >= 11)
                    throw new CpfException("CPF inválido");
            }
        }
    }

}
