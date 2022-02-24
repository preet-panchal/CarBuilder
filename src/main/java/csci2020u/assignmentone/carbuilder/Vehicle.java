package csci2020u.assignmentone.carbuilder;

public class Vehicle implements VehiclePlan{

    private String vehicleColor;
    private String vehicleMake;
    private String vehicleType;
    private String vehicleOwner;
    private int vehiclePrice;

    // sets vehicle color
    @Override
    public void setColor(String color) {
        vehicleColor = color;
    }

    // gets vehicle color
    public String getVehicleColor() {
        return vehicleColor;
    }

    // sets vehicle make
    @Override
    public void setMake(String make) {
        vehicleMake = make;
    }

    // gets vehicle make
    public String getVehicleMake() {
        return vehicleMake;
    }

    // sets vehicle type
    @Override
    public void setType(String type) {
        vehicleType = type;
    }

    // gets vehicle type
    public String getVehicleType() {
        return vehicleType;
    }

    // sets vehicle owner
    @Override
    public void setOwner(String owner) {
        vehicleOwner = owner;
    }

    // gets vehicle owner
    public String getVehicleOwner() {
        return vehicleOwner;
    }

    // sets vehicle price
    @Override
    public void setPrice(int price) {
        vehiclePrice = price;
    }

    // gets vehicle price
    public int getVehiclePrice() {
        return vehiclePrice;
    }
}
