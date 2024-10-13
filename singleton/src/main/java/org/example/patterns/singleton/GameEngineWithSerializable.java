package org.example.patterns.singleton;

import java.io.Serializable;

public class GameEngineWithSerializable implements Serializable {

    private static final long serialVersionUUID = 23232323;

    private int hp = 100;
    private String characterName = "";

    private static GameEngineWithSerializable instance = new GameEngineWithSerializable();

    private GameEngineWithSerializable() {
    }

    public static GameEngineWithSerializable getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }

}
