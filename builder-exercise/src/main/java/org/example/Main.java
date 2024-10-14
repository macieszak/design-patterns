package org.example;

public class Main {
    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles")
                .price(50)
                .build();
        leg.setDelayed(true);
        System.out.println(leg);
    }
}