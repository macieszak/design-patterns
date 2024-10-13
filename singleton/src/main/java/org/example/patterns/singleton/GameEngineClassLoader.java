package org.example.patterns.singleton;

public class GameEngineClassLoader {

    private int hp = 100;
    private String characterName = "";

    private static GameEngineClassLoader gameEngineInstance = new GameEngineClassLoader();
    // --> wywołuje się kiedy klasa jest ładowana do Class Loadera

    //konstruktor jest prywatny co powoduje, że możemy go wywołać jedynie z danej klasy
    private GameEngineClassLoader() {
    }

    public static GameEngineClassLoader getInstance() {
        return gameEngineInstance;
    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }

}
