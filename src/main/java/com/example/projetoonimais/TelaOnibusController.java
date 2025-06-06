package com.example.projetoonimais;

import com.example.projetoonimais.Classes.Onibus;
import com.example.projetoonimais.Classes.SecretarioOnibus;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaOnibusController {

    private SecretarioOnibus secretario;

    @FXML
    private TableView<Onibus> tabelaOnibus;

    @FXML
    private TableColumn<Onibus, Integer> colunaId;
    @FXML
    private TableColumn<Onibus, String> colunaPlaca;
    @FXML
    private TableColumn<Onibus, Integer> colunaCapacidade;
    @FXML
    private TableColumn<Onibus, String> colunaStatus;

    public void setSecretario(SecretarioOnibus secretario) {
        this.secretario = secretario;
        atualizarTabela();
    }

    private void atualizarTabela() {
        ObservableList<Onibus> dados = FXCollections.observableArrayList(secretario.getTodosOsOnibus());

        colunaId.setCellValueFactory(new PropertyValueFactory<>("Id"));
        colunaPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
        colunaCapacidade.setCellValueFactory(new PropertyValueFactory<>("capacidade"));
        colunaStatus.setCellValueFactory(new PropertyValueFactory<>("emManutencao"));

        tabelaOnibus.setItems(dados);
    }


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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/CadastroOnibus.fxml"));
            Parent root = loader.load();

            // Aqui é onde você precisa passar o secretário:
            CadastroOnibusController controller = loader.getController();
            controller.setSecretario(secretario); // <- Linha fundamental


            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
