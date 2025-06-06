package com.example.projetoonimais.Classes;

import java.util.ArrayList;

public class SecretarioMotorista implements SecretarioInterface {

    private ArrayList<Motorista> motoristas = new ArrayList<>();

    void alocarMotorista(ArrayList<Motorista> motorista){
        this.motoristas = motorista;

        for(Motorista motoris : motorista){
            motoris.setNome("Robertão");
            motoris.setIdade(12);
            motoris.setTelefone("40028922");
            motoris.setCPF("1232430240");
            motoris.setCNH(131321);
            motoris.setEmail("fldfalkfs@gmaiskfskf");
            motoris.setEndereco("Rua 143424");
        }

    }

    @Override
    public void verificarDados() {
        for (Motorista motorista : motoristas) {
            System.out.println(motorista.getNome());
            System.out.println(motorista.getCNH());
            System.out.println(motorista.getCpf());
            System.out.println(motorista.getEmail());
            System.out.println(motorista.getTelefone());
            System.out.println(motorista.getIdade());
            System.out.println(motorista.getEndereco());
        }
    }

    @Override
    public void listarIten() {
        System.out.println("Lista de motoristas");
        for (Motorista motorista : motoristas){
            System.out.println(motorista.getNome());
            System.out.println(motorista.getCpf());
            System.out.println(motorista.getCNH());
            System.out.println(motorista.getTelefone());
        }
    }


}

