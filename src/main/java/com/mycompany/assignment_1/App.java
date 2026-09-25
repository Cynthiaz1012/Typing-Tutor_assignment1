package com.mycompany.assignment_1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 * JavaFX App
 * @author Cynthia Zhang
 */
public class App extends Application {
    
     String[] texts = {
        "Try typing this text. Do it as quickly and accurately as you can.",
        "Next type another line of input data.",
        "The quick brown fox jumps over the lazy dog.",
        "Five big quacking zephyrs jolt my wax bed.",
        "Sympathizing would fix Quaker objectives.",
        "A large fawn jumped quickly over white zinc boxes."
    };

    int textNumber = 0;

    @Override
    public void start(Stage primaryStage) {
        Button[] keyButtons = {
            new Button("1"),
            new Button("2"),
            new Button("3"),
            new Button("4"),
            new Button("5"),
            new Button("6"),
            new Button("7"),
            new Button("8"),
            new Button("9"),
            new Button("0"),
            new Button("-"),
            new Button("="),
            new Button("Backspace"),

            new Button("Tab"),
            new Button("Q"),
            new Button("W"),
            new Button("E"),
            new Button("R"),
            new Button("T"),
            new Button("Y"),
            new Button("U"),
            new Button("I"),
            new Button("O"),
            new Button("P"),
            new Button("["),
            new Button("]"),

            new Button("Caps"),
            new Button("A"),
            new Button("S"),
            new Button("D"),
            new Button("F"),
            new Button("G"),
            new Button("H"),
            new Button("J"),
            new Button("K"),
            new Button("L"),
            new Button("Enter"),

            new Button("Shift"),
            new Button("Z"),
            new Button("X"),
            new Button("C"),
            new Button("V"),
            new Button("B"),
            new Button("N"),
            new Button("M"),
            new Button(","),
            new Button("."),
            new Button("Shift"),

            new Button("Ctrl"),
            new Button("Alt"),
            new Button("Space"),
            new Button("Alt"),
            new Button("Ctrl")
        };
        
        String[] keyNames = {
            "DIGIT1",
            "DIGIT2",
            "DIGIT3",
            "DIGIT4",
            "DIGIT5",
            "DIGIT6",
            "DIGIT7",
            "DIGIT8",
            "DIGIT9",
            "DIGIT0",
            "MINUS",
            "EQUALS",
            "BACK_SPACE",

            "TAB",
            "Q",
            "W",
            "E",
            "R",
            "T",
            "Y",
            "U",
            "I",
            "O",
            "P",
            "OPEN_BRACKET",
            "CLOSE_BRACKET",

            "CAPS",
            "A",
            "S",
            "D",
            "F",
            "G",
            "H",
            "J",
            "K",
            "L",
            "ENTER",

            "SHIFT",
            "Z",
            "X",
            "C",
            "V",
            "B",
            "N",
            "M",
            "COMMA",
            "PERIOD",
            "SHIFT",

            "CONTROL",
            "ALT",
            "SPACE",
            "ALT",
            "CONTROL"
        };

        TextField expectedField = new TextField();
        expectedField.setText(texts[textNumber]);
        TextField responseField = new TextField();
        
        Label keyLabel = new Label("Key pressed:");
        Label keyPressedLabel = new Label("");
        
        Label messageLabel = new Label("");
        
        Label correctLabel = new Label("Correct: 0");
        Label incorrectLabel = new Label("Incorrect: 0");
        
        responseField.setOnKeyPressed(event -> {
            String key = event.getCode().toString();
            keyPressedLabel.setText(key);
            boolean handled = false;

            for (int i = 0; i < keyNames.length; i++) {
                if (keyNames[i].equals(key)) {
                    keyButtons[i].setStyle(
                            "-fx-background-color: yellow;"
                    );
                    handled = true;
                }
            }
            
            if (!handled) {
                messageLabel.setText("Not handled");
                messageLabel.setStyle(
                        "-fx-text-fill: red;"
                );

            } else {
                messageLabel.setText("");
                messageLabel.setStyle("");
            } 
        });
        
         responseField.setOnKeyReleased(event -> { 
            String key = event.getCode().toString(); 

            for (int i = 0; i < keyNames.length; i++) { 
                if (keyNames[i].equals(key)) { 
                    keyButtons[i].setStyle(""); 
                } 
            }   
            
            updateScore(responseField,expectedField,correctLabel,incorrectLabel);
        });
   
        Button nextButton = new Button( "Go to next input text");
        Button resetButton = new Button("Reset");
       
        Label counterLabel = new Label("1 of " + texts.length);
       
        nextButton.setOnAction(event -> {
            if (textNumber < texts.length - 1) {
                textNumber++;
                expectedField.setText(texts[textNumber]);
                responseField.setText("");
                counterLabel.setText((textNumber + 1) + " of " + texts.length);
                correctLabel.setText("Correct: 0");
                incorrectLabel.setText("Incorrect: 0");
                keyPressedLabel.setText("");
                messageLabel.setText("");
                messageLabel.setStyle("");
                for (int i = 0; i < keyButtons.length; i++) {
                    keyButtons[i].setStyle("");
                }
            }
        });
        
        resetButton.setOnAction(event -> {
            textNumber = 0;
            expectedField.setText(texts[textNumber]);
            responseField.setText("");
            counterLabel.setText("1 of " + texts.length);
            correctLabel.setText("Correct: 0");
            incorrectLabel.setText("Incorrect: 0");
            keyPressedLabel.setText("");
            messageLabel.setText("");
            messageLabel.setStyle("");
            for (int i = 0; i < keyButtons.length; i++) {
                keyButtons[i].setStyle("");
            }
        });
        
        GridPane keyboard = new GridPane();
        keyboard.setHgap(5);
        keyboard.setVgap(5);
        keyboard.setPadding(new Insets(5));
        keyboard.setAlignment(Pos.CENTER);
             
        keyboard.add(keyButtons[0], 0, 0);
        keyboard.add(keyButtons[1], 1, 0);
        keyboard.add(keyButtons[2], 2, 0);
        keyboard.add(keyButtons[3], 3, 0);
        keyboard.add(keyButtons[4], 4, 0);
        keyboard.add(keyButtons[5], 5, 0);
        keyboard.add(keyButtons[6], 6, 0);
        keyboard.add(keyButtons[7], 7, 0);
        keyboard.add(keyButtons[8], 8, 0);
        keyboard.add(keyButtons[9], 9, 0);
        keyboard.add(keyButtons[10], 10, 0);
        keyboard.add(keyButtons[11], 11, 0);
        keyboard.add(keyButtons[12], 12, 0);
        
        keyboard.add(keyButtons[13], 0, 1);
        keyboard.add(keyButtons[14], 1, 1);
        keyboard.add(keyButtons[15], 2, 1);
        keyboard.add(keyButtons[16], 3, 1);
        keyboard.add(keyButtons[17], 4, 1);
        keyboard.add(keyButtons[18], 5, 1);
        keyboard.add(keyButtons[19], 6, 1);
        keyboard.add(keyButtons[20], 7, 1);
        keyboard.add(keyButtons[21], 8, 1);
        keyboard.add(keyButtons[22], 9, 1);
        keyboard.add(keyButtons[23], 10, 1);
        keyboard.add(keyButtons[24], 11, 1);
        keyboard.add(keyButtons[25], 12, 1);
        
        keyboard.add(keyButtons[26], 0, 2);
        keyboard.add(keyButtons[27], 1, 2);
        keyboard.add(keyButtons[28], 2, 2);
        keyboard.add(keyButtons[29], 3, 2);
        keyboard.add(keyButtons[30], 4, 2);
        keyboard.add(keyButtons[31], 5, 2);
        keyboard.add(keyButtons[32], 6, 2);
        keyboard.add(keyButtons[33], 7, 2);
        keyboard.add(keyButtons[34], 8, 2);
        keyboard.add(keyButtons[35], 9, 2);
        keyboard.add(keyButtons[36], 10, 2);
        
        keyboard.add(keyButtons[37], 0, 3);
        keyboard.add(keyButtons[38], 1, 3);
        keyboard.add(keyButtons[39], 2, 3);
        keyboard.add(keyButtons[40], 3, 3);
        keyboard.add(keyButtons[41], 4, 3);
        keyboard.add(keyButtons[42], 5, 3);
        keyboard.add(keyButtons[43], 6, 3);
        keyboard.add(keyButtons[44], 7, 3);
        keyboard.add(keyButtons[45], 8, 3);
        keyboard.add(keyButtons[46], 9, 3);
        keyboard.add(keyButtons[47], 10, 3);
        
        keyboard.add(keyButtons[48], 2, 4);
        keyboard.add(keyButtons[49], 3, 4);
        keyboard.add(keyButtons[50], 4, 4);
        keyboard.add(keyButtons[51], 5, 4);
        keyboard.add(keyButtons[52], 6, 4);
      
        VBox textSection = new VBox(8);
        textSection.getChildren().add(expectedField);
        
        HBox nextSection = new HBox(10);
        nextSection.setAlignment(Pos.CENTER_RIGHT);
        nextSection.getChildren().addAll(nextButton,counterLabel);
        
        HBox information = new HBox(15);
        information.setAlignment(Pos.CENTER_LEFT);
        information.getChildren().addAll(keyLabel,keyPressedLabel,messageLabel,correctLabel,incorrectLabel,resetButton);
        
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(textSection,nextSection,responseField,keyboard,information);
        
        Scene scene = new Scene(root,1050,500);
        primaryStage.setTitle("Typing App");
        primaryStage.setScene(scene);
        primaryStage.show();
}
    
       public void updateScore(TextField responseField,TextField expectedField,Label correctLabel,Label incorrectLabel) {
        String response = responseField.getText();
        String expected = expectedField.getText();
        int correct = 0;
        int incorrect = 0;
        
        for (int i = 0; i < response.length(); i++) {
            if (i < expected.length() && response.charAt(i) == expected.charAt(i)) {
                correct++;
            } else {
                incorrect++;
            }
        }
 
        correctLabel.setText("Correct: " + correct);
        incorrectLabel.setText("Incorrect: " + incorrect);
    }

    public static void main(String[] args) {
        launch();
    }
}
