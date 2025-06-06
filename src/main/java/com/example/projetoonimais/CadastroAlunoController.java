package com.example.projetoonimais;

import com.example.projetoonimais.Classes.Aluno;
import com.example.projetoonimais.Classes.Dias;
import com.example.projetoonimais.Classes.SecretarioAluno;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class CadastroAlunoController {

    // Objetos

    private Aluno alunoCadastrado;
    private Aluno aluno;


    // Botões

    @FXML
    private javafx.scene.control.TextField nomeField;

    @FXML
    private javafx.scene.control.TextField cpfField;

    // adicione os outros campos do Aluno aqui
    @FXML
    private javafx.scene.control.TextField emailField;

    @FXML
    private javafx.scene.control.TextField telefoneField;

    @FXML
    private javafx.scene.control.TextField enderecoField;

    @FXML
    private javafx.scene.control.TextField instituicaoField;

    @FXML
    private TextField idadeField;

    @FXML
    private javafx.scene.control.Button salvarButton;

    @FXML private ToggleButton segundaButton;
    @FXML private ToggleButton tercaButton;
    @FXML private ToggleButton quartaButton;
    @FXML private ToggleButton quintaButton;
    @FXML private ToggleButton sextaButton;
    @FXML private ToggleButton sabadoButton;

    @FXML
    private void salvarAluno() {
        Set<Dias> diasSelecionados = new HashSet<>();

        if (segundaButton.isSelected()) diasSelecionados.add(Dias.SEGUNDA);
        if (tercaButton.isSelected()) diasSelecionados.add(Dias.TERCA);
        if (quartaButton.isSelected()) diasSelecionados.add(Dias.QUARTA);
        if (quintaButton.isSelected()) diasSelecionados.add(Dias.QUINTA);
        if (sextaButton.isSelected()) diasSelecionados.add(Dias.SEXTA);
        if (sabadoButton.isSelected()) diasSelecionados.add(Dias.SABADO);

        EnumSet<Dias> diasEnumSet = EnumSet.copyOf(diasSelecionados);

        aluno = new Aluno(
                cpfField.getText(),
                nomeField.getText(),
                Integer.parseInt(idadeField.getText()),
                emailField.getText(),
                telefoneField.getText(),
                enderecoField.getText(),
                instituicaoField.getText(),
                diasEnumSet
        );

        // Salva o aluno na lista estática
        SecretarioAluno.adicionarAluno(aluno);

        // Fecha a janela
        ((Stage) salvarButton.getScene().getWindow()).close();
    }


    // Gets

    public Aluno getAlunoCadastrado() {
        return alunoCadastrado;
    }

    public Aluno getAluno() {
        return aluno;
    }
}
