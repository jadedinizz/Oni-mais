package com.example.projetoonimais;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/projetoonimais/telaAlunos.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Tela de Cadastro de Alunos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
