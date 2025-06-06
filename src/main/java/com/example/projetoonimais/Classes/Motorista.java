package com.example.projetoonimais.Classes;

public class Motorista extends Pessoa {
    private int CNH;



    public Motorista(String CPF, String nome, int idade, String email, String telefone, String endereco, int CNH) {
        super(CPF, nome, idade, email, telefone, endereco);
        this.CNH = CNH;
    }

    // Gets e Sets


    public int getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
        this.CNH = CNH;
    }


}
