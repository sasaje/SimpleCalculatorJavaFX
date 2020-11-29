package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    // koble fxml til java
    @FXML
    TextField textField1;
    public TextField inputA;
    public TextField inputB;

    public void showResult(){

        int number1 = Integer.parseInt(inputA.getText());
        int number2 = Integer.parseInt(inputB.getText());
        int sum = number1+number2;

        textField1.clear();
        System.out.println("Button calculate was clicked");
        textField1.appendText(""+sum);
    }
}
