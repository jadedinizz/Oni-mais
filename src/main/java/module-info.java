module com.example.projetoonimais {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetoonimais to javafx.fxml;
    exports com.example.projetoonimais;
}