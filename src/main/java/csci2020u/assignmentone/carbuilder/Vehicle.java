package csci2020u.assignmentone.carbuilder;

public class Vehicle implements VehiclePlan{

    private String vehicleColor;
    private String vehicleMake;
    private String vehicleType;
    private String vehicleOwner;
    private int vehiclePrice;

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

    @Override
    public void setType(String type) {
        vehicleType = type;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void setOwner(String owner) {
        vehicleOwner = owner;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    @Override
    public void setPrice(int price) {
        vehiclePrice = price;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }
}
