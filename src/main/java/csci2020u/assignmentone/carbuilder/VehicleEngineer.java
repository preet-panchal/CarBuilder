package csci2020u.assignmentone.carbuilder;

public class VehicleEngineer {

    private VehicleBuilder vehicleBuilder;

    public VehicleEngineer(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    // gets newly built vehicle
    public Vehicle getVehicle() {
        return this.vehicleBuilder.getVehicle();
    }

    // builds vehicle
    public void makeVehicle() {
        this.vehicleBuilder.buildVehicleColor();
        this.vehicleBuilder.buildVehicleMake();
        this.vehicleBuilder.buildVehicleType();
        this.vehicleBuilder.buildVehicleOwner();
        this.vehicleBuilder.buildVehiclePrice();
    }

}
