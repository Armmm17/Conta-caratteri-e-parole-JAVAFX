package com.armmm17.contacaratterieparolejavafx;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.control.Label;

public class Sotto extends HBox {

    private Main main;
    private Label charCount;
    private Label wordCount;

    public Sotto(Main main){

        this.main = main;
        setMinHeight(V.HEIGHT/2);
        setBackground(new Background(new BackgroundFill(Paint.valueOf("Blue"), CornerRadii.EMPTY, Insets.EMPTY)));

        this.charCount = new Label("Caratteri: "+getMain().getSopra().getCharCount());
        this.wordCount = new Label("\t\tParole: "+getMain().getSopra().getWordCount());

        this.getChildren().add(charCount);
        this.getChildren().add(wordCount);

    }

    public void setCharCount(Label charCount) {
        this.charCount = charCount;
    }

    public Label getCharCount() {
        return charCount;
    }

    public Label getWordCount() {
        return wordCount;
    }

    public Main getMain() {
        return main;
    }
}
