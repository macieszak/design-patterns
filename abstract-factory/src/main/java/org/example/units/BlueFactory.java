package org.example.units;

public class BlueFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN -> {
                return new Rifleman(25, 0, 5);
            }
            default -> throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType) {
            case TANK -> {
                return new Tank(100, 0, 25);
            }
            default -> throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType) {
            case HELICOPTER -> {
                return new Helicopter(50, 0, 15);
            }
            default -> throw new UnsupportedOperationException("Nieznany typ");
        }
    }

}
