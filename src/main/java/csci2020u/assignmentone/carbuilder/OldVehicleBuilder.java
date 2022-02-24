package csci2020u.assignmentone.carbuilder;

import java.util.Objects;

public class OldVehicleBuilder implements VehicleBuilder{

    private Vehicle vehicle;
    private String color;
    private String make;
    private String type;
    private String owner;
    private int price = 0;

    // vehicle object constructor
    public OldVehicleBuilder(String color, String make, String type, String owner) {
        this.vehicle = new Vehicle();
        this.color = color;
        this.make = make;
        this.type = type;
        this.owner = owner;

        // Check vehicle type and make to change price accordingly
        if (Objects.equals(type, "Sedan")) {
            if (Objects.equals(make, "Toyota")){
                price += 20000;
            } else if (Objects.equals(make, "Honda")) {
                price += 18000;
            } else {
                price += 15000;
            }
        }
        else if (Objects.equals(type, "SUV")) {
            if (Objects.equals(make, "Toyota")){
                price += 28000;
            } else if (Objects.equals(make, "Honda")) {
                price += 26000;
            } else {
                price += 24000;
            }
        } else {
            if (Objects.equals(make, "Toyota")){
                price += 36000;
            } else if (Objects.equals(make, "Honda")) {
                price += 34000;
            } else {
                price += 31000;
            }
        }
    }

    // builds vehicle color
    @Override
    public void buildVehicleColor() {
        vehicle.setColor(color);
    }

    // builds vehicle make
    @Override
    public void buildVehicleMake() {
        vehicle.setMake(make);
    }

    // builds vehicle type
    @Override
    public void buildVehicleType() {
        vehicle.setType(type);
    }

    // builds vehicle owner
    @Override
    public void buildVehicleOwner() {
        vehicle.setOwner(owner);
    }

    // builds vehicle price
    @Override
    public void buildVehiclePrice() {
        vehicle.setPrice(price);
    }

    // gets newly built vehicle
    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
