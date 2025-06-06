package com.example.projetoonimais;

import com.example.projetoonimais.Classes.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;


public class CadastroOnibusController {


    private SecretarioOnibus secretario = new SecretarioOnibus();

    public void setSecretario(SecretarioOnibus secretario) {
        this.secretario = secretario;
    }

    @FXML
    private TextField campoIdOnibus;

    @FXML
    private TextField campoPlaca;

    @FXML
    private TextField campoCapacidade;

    @FXML
    private CheckBox checkBoxManutencao;

    @FXML
    private void cadastrarOnibus(ActionEvent event) {
        try {
            int id = Integer.parseInt(campoIdOnibus.getText());
            String placa = campoPlaca.getText();
            int capacidade = Integer.parseInt(campoCapacidade.getText());
            boolean emManutencao = checkBoxManutencao.isSelected();

            Onibus novoOnibus = new Onibus(id, placa, capacidade, emManutencao); // Melhor usar um construtor

            if (secretario == null) {
                System.err.println("Erro: secretário não definido no controller!");
                return;
            }

            secretario.adicionarOnibus(novoOnibus);

            abrirTelaOnibus(event);

        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter dados numéricos. Verifique os campos.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void abrirTelaOnibus(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/TelaOnibus.fxml"));
        Parent root = loader.load();

        TelaOnibusController controller = loader.getController();
        controller.setSecretario(secretario);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

