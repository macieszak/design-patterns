package state;

public interface State {

    void insertCoin(SlotMachine machine);

    void pullLever(SlotMachine machine);

    void collectWin(SlotMachine machine);

    void currenState(SlotMachine machine);

}
