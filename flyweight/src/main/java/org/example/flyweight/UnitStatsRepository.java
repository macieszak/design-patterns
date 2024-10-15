package org.example.flyweight;

public class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats("Destroyer", 500, 250, 70, 10, 800);
    private static UnitStats teslaTankUnitStats = new UnitStats("TeslaTank",200,100,50,25, 500);
    private static UnitStats riflemanUnitStats = new UnitStats("Rifleman", 25, 5, 20, 25, 50);

    private UnitStatsRepository() {
    }

    public static UnitStats getDestroyerUnitStats() {
        return destroyerStats;
    }

    public static UnitStats getTeslaTankUnitStats() {
        return teslaTankUnitStats;
    }

    public static UnitStats getRiflemanUnitStats() {
        return riflemanUnitStats;
    }

}
