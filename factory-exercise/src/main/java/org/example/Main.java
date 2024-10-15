package org.example;

import org.example.cars.BMWModel;
import org.example.cars.Car;
import org.example.cars.FordModel;
import org.example.factory.CommonwealthFactory;
import org.example.factory.ContinentalFactory;
import org.example.factory.Factory;

public class Main {
    public static void main(String[] args) {

        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getSteeringWheelPosition());

    }
}