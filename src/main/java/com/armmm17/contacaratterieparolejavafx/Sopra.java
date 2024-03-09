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
                System.out.println(input);

                boolean ok = true;



                if(ok){
                    //set value for charcount
                    getMain().getSopra().setCharCount(getMain().getSopra().getTf().getText().length());
                    //update label charcount
                    getMain().getSotto().getCharCount().setText("Caratteri: "+getMain().getSopra().getCharCount());
                    //DEbug console show word & charcount
                    System.out.println(getCharCount());

                    getMain().getSopra().setWordCount(countWord(getMain().getSopra().getTf().getText()));
                    getMain().getSotto().getWordCount().setText("\t\tParole: "+getMain().getSopra().getWordCount());
                    System.out.println(getWordCount());


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

    public int getCharCount() {
        return this.charCount;
    }

    public int getWordCount() {return this.wordCount;}

    public void setWordCount(int wordCount) {this.wordCount = wordCount;}

    public int countWord(String str) {
        int countWords = str.split("\\s").length;
        return countWords;
    }
}