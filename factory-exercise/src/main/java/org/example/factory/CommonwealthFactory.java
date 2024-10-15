package org.example.factory;

import org.example.cars.*;

public class CommonwealthFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5 -> {
                return new BMW(2.0, "Diesel", 2000, position);
            }
            case E60 -> {
                return new BMW(3.0, "Gas", 2015, position);
            }
            default -> throw new IllegalArgumentException("Unknown model");
        }
    }

    @Override
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMAX -> {
                return new Ford(1.8, "Diesel", 2001, position);
            }
            case Focus -> {
                return new Ford(2.0, "Gas", 2020, position);
            }
            default -> throw new IllegalArgumentException("Unknown model");
        }
    }

}
