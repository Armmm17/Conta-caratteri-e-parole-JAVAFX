module com.armmm17.contacaratterieparolejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.armmm17.contacaratterieparolejavafx to javafx.fxml;
    exports com.armmm17.contacaratterieparolejavafx;
}