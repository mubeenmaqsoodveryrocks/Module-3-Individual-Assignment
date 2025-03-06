package edu.farmingdale.module_03individual_assignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import java.util.Objects;
import java.util.Random;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Top Controls
        Button btnFindSolution = new Button("Find a Solution");
        TextField txtExpression = new TextField("(6+6)*12/6");
        Button btnRefresh = new Button("Refresh");

        HBox topControls = new HBox(10, btnFindSolution, txtExpression, btnRefresh);
        topControls.setStyle("-fx-padding: 10; -fx-alignment: center;");

        // Card Display using ImageView
        ImageView card1 = new ImageView(new Image("file:Diamonds 6.png"));
        ImageView card2 = new ImageView(new Image("file:Queen_of_Spades.png"));
        ImageView card3 = new ImageView(new Image("file:6 Spades.png"));
        ImageView card4 = new ImageView(new Image("file:Clubs 6.png"));

        for (ImageView card : new ImageView[]{card1, card2, card3, card4}) {
            card1.setFitHeight(150.0);
            card1.setFitWidth(200.0);
            card2.setFitHeight(150);
            card2.setFitWidth(200);
            card3.setFitHeight(150);
            card3.setFitWidth(200);
            card4.setFitHeight(150);
            card4.setFitWidth(200);
        }

        HBox cardDisplay = new HBox(10, card1, card2, card3, card4);
        cardDisplay.setStyle("-fx-padding: 10; -fx-alignment: center;");

        //Use of Controls
        Label lblEnterExpression = new Label("Enter an expression:");
        TextField userInput = new TextField();
        Button btnVerify = new Button("Verify");

        HBox bottomControls = new HBox(10, lblEnterExpression, userInput, btnVerify);
        bottomControls.setStyle("-fx-padding: 10; -fx-alignment: center;");

        //Main Layout
        VBox root = new VBox(10, topControls, cardDisplay, bottomControls);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        //Scene and Stage
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Card 24 Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}