package com.example.projetoonimais;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaOnibusController {

    @FXML
    private void abrirTelaOnibus(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/telaOnibus.fxml"));
            Scene novaCena = new Scene(loader.load());

            // Pega a janela atual (Stage) a partir do botão clicado
            Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stageAtual.setScene(novaCena);
            stageAtual.setTitle("Tela Onibus");
            stageAtual.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void abrirTelaMotorista(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/telaMotorista.fxml"));
            Scene novaCena = new Scene(loader.load());

            // Pega a janela atual (Stage) a partir do botão clicado
            Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stageAtual.setScene(novaCena);
            stageAtual.setTitle("Tela Onibus");
            stageAtual.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void abrirTelaAlunos(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/telaAlunos.fxml"));
            Scene novaCena = new Scene(loader.load());

            // Pega a janela atual (Stage) a partir do botão clicado
            Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stageAtual.setScene(novaCena);
            stageAtual.setTitle("Tela Onibus");
            stageAtual.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void abrirTelaCadastroMotorista(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/cadastroMotorista.fxml"));
            Scene novaCena = new Scene(loader.load());
            Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageAtual.setScene(novaCena);
            stageAtual.setTitle("Cadastro de Motorista");
            stageAtual.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void abrirTelaCadastroAluno(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/cadastroAluno.fxml"));
            Scene novaCena = new Scene(loader.load());
            Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageAtual.setScene(novaCena);
            stageAtual.setTitle("Cadastro de Aluno");
            stageAtual.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void abrirTelaCadastroOnibus(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/cadastroOnibus.fxml"));
            Scene novaCena = new Scene(loader.load());
            Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageAtual.setScene(novaCena);
            stageAtual.setTitle("Cadastro de Aluno");
            stageAtual.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
