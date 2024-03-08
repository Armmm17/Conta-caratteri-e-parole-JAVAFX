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
        getMain();
        this.charCount = new Label("Caratteri: "+getMain().getSopra().getCharCount());

        this.getChildren().add(charCount);

    }

    public Main getMain() {
        return main;
    }
}
