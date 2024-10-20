package state;

public class NoCoinState implements State {

    @Override
    public void insertCoin(SlotMachine machine) {
        System.out.println("Wrzucono monetę");
        machine.state = new InsertedCoinState();
    }

    @Override
    public void pullLever(SlotMachine machine) {
        System.out.println("Wrzuć monetę by zagrać.");
    }

    @Override
    public void collectWin(SlotMachine machine) {
        System.out.println("Wrzuć monetę by dać sobie szansę na wygraną.");
    }

    @Override
    public void currenState(SlotMachine machine) {
        System.out.println("Aktualny stan - BRAK MONETY");
    }

}
