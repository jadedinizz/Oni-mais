package com.example.projetoonimais.Classes;

public class Onibus {
    private int id;
    private String placa;
    private int capacidade;
    private boolean emManutencao;

    public Onibus() {
        // Construtor vazio necessário para criação sem argumentos
    }

    public Onibus(int id, String placa, int capacidade, boolean emManutencao) {
        this.id = id;
        this.placa = placa;
        this.capacidade = capacidade;
        this.emManutencao = emManutencao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }

}