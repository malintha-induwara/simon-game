module com.example.memorygame {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.simon to javafx.fxml;
    exports com.example.simon;
}