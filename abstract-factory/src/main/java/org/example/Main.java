package org.example;

import org.example.units.*;

public class Main {
    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);

        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);

        System.out.println(redTank);
        System.out.println(redInfantry);
        System.out.println(blueTank);
        System.out.println(blueInfantry);
        System.out.println(blueHelicopter);
        System.out.println(redHelicopter);

    }
}