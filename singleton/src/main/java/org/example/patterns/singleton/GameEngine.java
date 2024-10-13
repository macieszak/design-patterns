package org.example.patterns.singleton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";

    //pole instacji musi być statyczne, abyśmy mogli się do niego dostać bez tworzenia obiektu, tak
    //samo metoda getInstance()
    private static GameEngine gameEngineInstance;
    //private static GameEngine gameEngineInstance = new GameEngine();
    // --> wywołuje się kiedy klasa jest ładowana do Class Loadera

    //konstruktor jest prywatny co powoduje, że możemy go wywołać jedynie z danej klasy
    private GameEngine() {
    }

    public static GameEngine getInstance() {
        if (gameEngineInstance == null) {
            //podwójne sprawdzenie zapobiegajace przed problemami z wielowątkowością
            synchronized (GameEngine.class) {
                if (gameEngineInstance == null) {
                    gameEngineInstance = new GameEngine();
                }
            }
        }
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
