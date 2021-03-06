package csci2020u.assignmentone.carbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CarBuilderController {
    @FXML public TextField Email;
    @FXML public ToggleGroup VehicleType;
    @FXML public ToggleGroup VehicleMake;
    @FXML public ColorPicker Color;
    @FXML public Label buildSummary;
    @FXML private TextField FullName;
    @FXML private DatePicker DOP;
    @FXML private TextField PhoneNumber;
    @FXML private Label buildComplete;

    /**
     * Handles onclick event on order button
     */
    @FXML
    protected void onHelloButtonClick() {
        try {
            // Gathers vehicle make and type from fxml input
            RadioButton selectedVehicleType = (RadioButton) VehicleType.getSelectedToggle();
            RadioButton selectedVehicleMake = (RadioButton) VehicleMake.getSelectedToggle();

            // Generates Vehicle Engineer and vehicle blueprint to pass to Engineer
            VehicleBuilder oldStyleVehicle = new OldVehicleBuilder(Color.getValue().toString(), selectedVehicleMake.getText(),
                    selectedVehicleType.getText(), FullName.getText());
            VehicleEngineer vehicleEngineer = new VehicleEngineer(oldStyleVehicle);

            // Make the vehicle given the specs provided by user inputs and retrieve vehicle
            vehicleEngineer.makeVehicle();
            Vehicle firstVehicle = vehicleEngineer.getVehicle();

            // Prints build summary after building vehicle
            buildComplete.setText("Your Build is Complete!");
            buildSummary.setText("Your " + firstVehicle.getVehicleMake() + " " + firstVehicle.getVehicleType() + " will cost: $"
             + firstVehicle.getVehiclePrice() + "\n\n" + "Vehicle Info:\n" + firstVehicle.getVehicleColor() + "\n" +
                    firstVehicle.getVehicleMake() + "\n" + firstVehicle.getVehicleType() + "\n" + "Date of Pickup: " +
                    DOP.getValue() + "\n\n" + "Contact info:\n" + firstVehicle.getVehicleOwner() + "\n" + Email.getText()
                    + "\n" + PhoneNumber.getText());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}