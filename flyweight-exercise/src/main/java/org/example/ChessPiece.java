package org.example;

public class ChessPiece {

    private final String name;
    private final int numberPosition;
    private final char letterPosition;
    private final Color color;

    public ChessPiece(String name, int numberPosition, char letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                this.color = ColorRepository.getWhite();
                break;
        }
    }

    public Color getColor() {
        return color;
    }

}
