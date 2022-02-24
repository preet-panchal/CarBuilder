package csci2020u.assignmentone.carbuilder;

public interface VehicleBuilder {

    // builds vehicle color
    public void buildVehicleColor();

    // builds vehicle make
    public void buildVehicleMake();

    // builds vehicle type
    public void buildVehicleType();

    // builds vehicle owner
    public void buildVehicleOwner();

    // builds vehicle price
    public void buildVehiclePrice();

    // retrieves newly built vehicle
    public Vehicle getVehicle();
}
