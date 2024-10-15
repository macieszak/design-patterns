package org.example.cars;

public abstract class Car {

    private final double engineCapacity;
    private final String fuelType;
    private final int productionYear;
    private final SteeringWheelPosition position;

    public Car(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition position) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.position = position;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return position;
    }

}
