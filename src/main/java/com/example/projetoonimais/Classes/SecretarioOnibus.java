package com.example.projetoonimais.Classes;

import java.util.ArrayList;

public class SecretarioOnibus implements SecretarioPoggers{

    private ArrayList<Onibus> todosOsOnibus = new ArrayList<>();
    private ArrayList<Motorista> todosOsMotoristas = new ArrayList<>();
    private static int quantidadeTotalDeOnibus = 0;

    void listarOnibusDisponiveis(){
        // Mostrar onibus disponiveis
        // Pode ser carros
    }

    public void verificarDadosMotorista() {
        // Printar os dados do motorista
    }

    public void desatribuir(){
        // Tira um motorista do array;
    }


    public void alocarOnibus(ArrayList<Onibus> onibus) {
        this.todosOsOnibus = onibus;

        for (Onibus onibusCriando : this.todosOsOnibus){
            onibusCriando.setId(12);
            onibusCriando.setCapacidade(30);
            onibusCriando.setPlaca("AIDS-34");
            onibusCriando.setEmManutencao(false);
        }
        quantidadeTotalDeOnibus++;
    }

    @Override
    public void verificarDados() {
        System.out.println("Dados dos ônibus");
        for (Onibus o : todosOsOnibus) {
            System.out.println("ID: " + o.getId());
            System.out.println("Placa: " + o.getPlaca());
            System.out.println("Capacidade: " + o.getCapacidade());
            System.out.println("Em Manutenção: " + (o.isEmManutencao() ? "Disponivel" : "Em manutenção"));
        }
        System.out.println("Total de ônibus: " + todosOsOnibus.size());
    }

    @Override
    public void listarIten() {
        System.out.println("Dados dos ônibus");
        for (Onibus o : todosOsOnibus) {
            System.out.println("ID: " + o.getId());
            System.out.println("Placa: " + o.getPlaca());
            System.out.println("Capacidade: " + o.getCapacidade());
            System.out.println("Em Manutenção: " + (o.isEmManutencao() ? "Disponivel" : "Em manutenção"));
        }
    }
}
