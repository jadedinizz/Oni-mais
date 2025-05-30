package com.example.projetoonimais.Classes;

import java.util.ArrayList;

public class Onibus {

    private int id;
    private String placa;
    private int capacidade;
    private int lotacaoAtual;
    private boolean emManutencao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getLotacaoAtual() {
        return lotacaoAtual;
    }

    public void setLotacaoAtual(int lotacaoAtual) {
        this.lotacaoAtual = lotacaoAtual;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao)    {
        this.emManutencao = emManutencao;
    }

}
