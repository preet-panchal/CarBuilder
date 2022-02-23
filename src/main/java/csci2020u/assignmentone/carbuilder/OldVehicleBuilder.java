package csci2020u.assignmentone.carbuilder;

import java.util.Objects;

public class OldVehicleBuilder implements VehicleBuilder{

    private Vehicle vehicle;
    private String color;
    private String make;
    private String type;
    private String owner;
    private int price = 0;

    public OldVehicleBuilder(String color, String make, String type, String owner) {
        this.vehicle = new Vehicle();
        this.color = color;
        this.make = make;
        this.type = type;
        this.owner = owner;

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

    @Override
    public void buildVehicleColor() {
        vehicle.setColor(color);
    }

    @Override
    public void buildVehicleMake() {
        vehicle.setMake(make);
    }

    @Override
    public void buildVehicleType() {
        vehicle.setType(type);
    }

    @Override
    public void buildVehicleOwner() {
        vehicle.setOwner(owner);
    }

    @Override
    public void buildVehiclePrice() {
        vehicle.setPrice(price);
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
