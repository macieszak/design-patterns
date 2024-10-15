package org.example;

import org.example.units.*;

public class Main {
    public static void main(String[] args) {

        InfantryFactory factory = new RedInfantryUnitFactory();

        InfantryUnit tank = factory.createUnit(UnitType.TANK);
        InfantryUnit rifleman = factory.createUnit(UnitType.RIFLEMAN);

        //Unit tank2 = new Tank(200, 0, 20);

    }
}