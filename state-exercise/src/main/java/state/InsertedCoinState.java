package state;

import java.util.Random;

public class InsertedCoinState implements State {

    static final private Random random = new Random();

    @Override
    public void insertCoin(SlotMachine machine) {
        System.out.println("Moneta znajduję się już w automacie.");
    }

    @Override
    public void pullLever(SlotMachine machine) {
        System.out.println("Trwa losowanie...");
        int result = random.nextInt(99);
        if (result < 20) {
            System.out.println("Wygrana! Odbierz swoją nagrodę");
            machine.state = new WinState();
        } else {
            System.out.println("Przegrana. Może następnym razem się uda?");
            machine.state = new NoCoinState();
        }
    }

    @Override
    public void collectWin(SlotMachine machine) {
        System.out.println("Pociągnij dźwignie by sprawdzić swoje szczęście.");
    }

    @Override
    public void currenState(SlotMachine machine) {
        System.out.println("Aktualny stan - WRZUCONO MONETĘ");
    }

}