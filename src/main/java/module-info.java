module com.example.bethehealer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bethehealer to javafx.fxml;
    exports com.example.bethehealer;
}