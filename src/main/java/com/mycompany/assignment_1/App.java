package com.mycompany.assignment_1;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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
    public void start(Stage stage) {
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
        
       
    }

    public static void main(String[] args) {
        launch();
    }

}
