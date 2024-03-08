package com.armmm17.contacaratterieparolejavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;

public class Sopra extends HBox {

    private Main main;
    private Label label;
    private TextField tf;
    private Button btn;
    private int charCount;
    private int wordCount;
    public Sopra(Main main){
        this.main = main;
        setMinHeight(V.HEIGHT/2);
        setBackground(new Background(new BackgroundFill(Paint.valueOf("red"), CornerRadii.EMPTY, Insets.EMPTY)));

        this.label = new Label("Input: ");
        this.tf = new TextField();
        this.btn = new Button("Invio");

        this.btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String input = getMain().getSopra().getTf().getText();

                boolean ok = true;
                int in = 0;
                try{ in = Integer.parseInt(input); }
                catch(Exception e){
                    getMain().getSopra().getTf();
                    ok = false;
                }


                if(ok){
                    getMain().getSopra().setCharCount(input.length());

                }

            }
        });


        this.getChildren().add(label);
        this.getChildren().add(tf);
        this.getChildren().add(btn);
    }

    public Main getMain() {
        return main;
    }

    public TextField getTf() {
        return tf;
    }

    public void setCharCount(int charCount) {
        this.charCount = charCount;
    }
}