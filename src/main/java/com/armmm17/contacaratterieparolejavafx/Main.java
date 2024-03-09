package com.armmm17.contacaratterieparolejavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Main extends Application {
    private Stage stage;
    private Sopra sopra;
    private Sotto sotto;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;

        VBox root = new VBox();
        Scene scene = new Scene(root, V.WIDTH, V.HEIGHT);

        this.sopra = new Sopra(this);
        this.sotto = new Sotto(this);

        root.getChildren().add(sopra);
        root.getChildren().add(sotto);



        stage.setTitle(V.TITOLO);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    public Stage getStage() {
        return stage;
    }

    public Sopra getSopra() {
        return sopra;
    }

    public Sotto getSotto() {
        return sotto;
    }

    public static void main(String[] args) {
        launch();
    }
}