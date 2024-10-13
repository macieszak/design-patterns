package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int score;
    private static GuessGame instance = new GuessGame();
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessGame() {
        score = 0;
    }

    public static GuessGame getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public int getScore() {
        return score;
    }

    public void play() {
        System.out.println("Gra rozpoczęta!");
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę: ");
            int numberFromPlayer = scanner.nextInt();
            int randomNumber = random.nextInt(10);
            if (numberFromPlayer == randomNumber) {
                score++;
                System.out.println("Udało ci się odgadnąć liczbę! Liczba to: " + randomNumber);
            } else {
                System.out.println("Pudło! \nLiczba to: " + randomNumber);
            }
        }
        System.out.println("\nKońcowy wynik: " + score);
    }

}
