package org.example.units;

public class RedInfantryUnitFactory extends InfantryFactory {

    @Override
    public InfantryUnit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK -> {
                return new Tank(100, 0, 20);
            }
            case RIFLEMAN -> {
                return new Rifleman(20, 0, 6);
            }
            default -> throw new UnsupportedOperationException("No such type.");
        }
    }

}
