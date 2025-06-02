package com.example.projetoonimais.Classes;
import java.util.EnumSet;

public abstract class Pessoa {
    protected String CPF;
    protected String nome;
    protected int idade;
    protected String email;
    protected String telefone;
    protected String endereco;



    public Pessoa(String CPF, String nome, int idade, String email, String telefone, String endereco) {
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
