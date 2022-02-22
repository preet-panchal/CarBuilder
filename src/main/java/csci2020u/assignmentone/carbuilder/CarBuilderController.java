package csci2020u.assignmentone.carbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CarBuilderController {
    @FXML public TextField Email;
    @FXML public ToggleGroup Vehicle_Type;
    @FXML public ToggleGroup Vehicle_Make;
    @FXML public ColorPicker Color;
    @FXML private TextField FullName;
    @FXML private DatePicker DOP;
    @FXML private TextField PhoneNumber;
    @FXML private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println(FullName.getText());
        System.out.println(PhoneNumber.getText());
        System.out.println(DOP.getValue());
        try {
            RadioButton selectedRadioButton = (RadioButton) Vehicle_Type.getSelectedToggle();
            System.out.println(selectedRadioButton.getText());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}