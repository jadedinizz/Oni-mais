package com.example.projetoonimais;

import com.example.projetoonimais.Classes.Aluno;
import com.example.projetoonimais.Classes.SecretarioAluno;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.scene.Parent;

import javafx.scene.control.Button;
import java.io.IOException;

public class TelaAlunosController {

    @FXML
    private TableView<Aluno> tabelaAlunos;

    @FXML
    private TableColumn<Aluno, String> nomeColumn;

    @FXML
    private TableColumn<Aluno, String> cpfColumn;

    @FXML
    private TableColumn<Aluno, String> emailColumn;
    @FXML
    private TableColumn<Aluno, String> telefoneColumn;
    @FXML
    private TableColumn<Aluno, String> enderecoColumn;
    @FXML
    private TableColumn<Aluno, String> instituicaoColumn;

    private ObservableList<Aluno> alunos = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        cpfColumn.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        telefoneColumn.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        enderecoColumn.setCellValueFactory(new PropertyValueFactory<>("endereco"));
        instituicaoColumn.setCellValueFactory(new PropertyValueFactory<>("instituicao"));

        alunos = FXCollections.observableArrayList(SecretarioAluno.getAlunos());
        tabelaAlunos.setItems(alunos);
    }





    @FXML
    private void abrirTelaCadastro(ActionEvent event) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("cadastroAluno.fxml"));
            Parent root = loader.load();

            CadastroAlunoController controller = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Cadastro de Aluno");

            // Espera a tela ser fechada antes de continuar
            stage.showAndWait();

            // Recupera o aluno cadastrado
            Aluno novoAluno = controller.getAluno();

            if (novoAluno != null) {
                alunos.add(novoAluno); // adiciona à ObservableList
                tabelaAlunos.setItems(alunos); // atualiza a tabela se necessário
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button btnOnibus;  // Referência para o botão "Onibus"

//    @FXML
//    private void initialize() {
//        // Se quiser, pode fazer alguma inicialização aqui
//    }

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
            Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageAtual.setScene(novaCena);
            stageAtual.setTitle("Cadastro de Motoristas");
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
            Parent root = loader.load();

            // Pega o controller ANTES de mostrar a tela
            CadastroAlunoController controller = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Cadastro de Aluno");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait(); // Espera o cadastro ser feito

            // Depois que a janela fecha, pega o aluno criado
            Aluno novoAluno = controller.getAluno();

            if (novoAluno != null) {
                alunos.add(novoAluno); // Adiciona à lista observável
                tabelaAlunos.refresh(); // Garante que a tabela atualize
            }

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