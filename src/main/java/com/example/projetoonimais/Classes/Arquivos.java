package com.example.projetoonimais.Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivos {

    static void escreverEmArquivo(String nomeArquivo, ArrayList<String> dados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : dados) {
                writer.write(linha);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}