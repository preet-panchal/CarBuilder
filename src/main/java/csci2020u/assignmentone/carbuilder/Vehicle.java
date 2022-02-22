package csci2020u.assignmentone.carbuilder;

public class Vehicle implements VehiclePlan{

    private String vehicleColor;
    private String vehicleMake;

    @Override
    public void setColor(String color) {
        vehicleColor = color;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    @Override
    public void setMake(String make) {
        vehicleMake = make;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }
}
