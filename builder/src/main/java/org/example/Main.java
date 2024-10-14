package org.example;

import org.example.house.House;

public class Main {
    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildRooms("rooms")
                .buildWindows("winodws")
                .build();
        System.out.println(house);

    }
}