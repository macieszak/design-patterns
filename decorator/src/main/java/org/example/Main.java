package org.example;

public class Main {
    public static void main(String[] args) {

        generateMap();

    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain swampPlain = new SwampDecorator(terrain);
        Terrain forestPlain = new ForestDecorator(terrain);
        System.out.println(swampPlain.getFuelCost());
        System.out.println(forestPlain.getFuelCost());

        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(terrain1);
        Terrain terrain3 = new ForestDecorator(terrain1);
        System.out.println(terrain2.getFuelCost());
        System.out.println(terrain3.getFuelCost());
        System.out.println();

        Terrain terrain4 = new SwampDecorator(new ForestDecorator(new Plain()));
        System.out.println("swamp forest plain cost: " + terrain4.getFuelCost());

        Terrain terrain5 = new RoadDecorator(new Hill());
        System.out.println(terrain5.getDescription() + " " +  terrain5.getFuelCost());


    }

}