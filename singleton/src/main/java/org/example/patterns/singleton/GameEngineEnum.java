package org.example.patterns.singleton;

public enum GameEngineEnum {

    INSTANCE("Duke");

    private int hp = 100;
    private String characterName = "";

    private GameEngineEnum(String characterName) {
        this.characterName = characterName;
    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }

}
