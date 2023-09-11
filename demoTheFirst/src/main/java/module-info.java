module com.example.demothefirst {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demothefirst to javafx.fxml;
    exports com.example.demothefirst;
}