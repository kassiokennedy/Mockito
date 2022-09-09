module com.example.mockito {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mockito to javafx.fxml;
    exports com.example.mockito;
}