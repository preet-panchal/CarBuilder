package csci2020u.assignmentone.carbuilder;

public class OldVehicleBuilder implements VehicleBuilder{

    private Vehicle vehicle;
    private String color;
    private String make;

    public OldVehicleBuilder(String color, String make) {
        this.vehicle = new Vehicle();
        this.color = color;
        this.make = make;
    }

    @Override
    public void buildVehicleColor() {
        vehicle.setColor(color);
    }

    @Override
    public void buildVehicleMake() {
        vehicle.setMake(make);
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
