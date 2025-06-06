package com.example.projetoonimais;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CadastroOnibusController {

    @FXML
    private void voltarParaOnibus(ActionEvent event) {
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
}
