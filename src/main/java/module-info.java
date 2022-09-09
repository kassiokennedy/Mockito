module com.example.mockito {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mockito.junit.jupiter;
    requires org.mockito;


    opens com.example.mockito to javafx.fxml;
    exports com.example.mockito;
}