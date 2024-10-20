package state;

public class WinState implements State {

    @Override
    public void insertCoin(SlotMachine machine) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void pullLever(SlotMachine machine) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void collectWin(SlotMachine machine) {
        System.out.println("Zabrano monety. Gratulacje.");
        machine.state = new NoCoinState();
    }

    @Override
    public void currenState(SlotMachine machine) {
        System.out.println("Aktualny stan - WYGRANA");
    }

}
