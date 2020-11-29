package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    // koble fxml til java
    @FXML
    TextField textField1;
    public TextField inputA;
    public TextField inputB;
    public Label errorMessage;

    public void showResult(){
        if (inputA.getText() == null || inputA.getText().trim().isEmpty() || inputB.getText() == null || inputB.getText().trim().isEmpty()) {
            errorMessage.setStyle("-fx-opacity: 1");
        } else{
            errorMessage.setStyle("-fx-opacity: 0");

            int number1 = Integer.parseInt(inputA.getText());
            int number2 = Integer.parseInt(inputB.getText());

            int sum = number1+number2;
            textField1.clear();
            System.out.println("Button calculate was clicked");
            textField1.appendText(String.valueOf(sum));
        }
    }
}
