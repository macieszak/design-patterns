package org.example;

import org.example.units.*;

public class Main {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);

        //Unit tank2 = new Tank(200, 0, 20);

    }
}