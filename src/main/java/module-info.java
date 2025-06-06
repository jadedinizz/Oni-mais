module com.example.projetoonimais {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetoonimais to javafx.fxml;
    opens com.example.projetoonimais.Classes to javafx.base;

    exports com.example.projetoonimais;
}