package csci2020u.assignmentone.carbuilder;

public class VehicleEngineer {

    private VehicleBuilder vehicleBuilder;

    public VehicleEngineer(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    public Vehicle getVehicle() {
        return this.vehicleBuilder.getVehicle();
    }

    public void makeVehicle() {
        this.vehicleBuilder.buildVehicleColor();
        this.vehicleBuilder.buildVehicleMake();
    }

}
