package state;

public class SlotMachine {

    State state;

    public SlotMachine() {
        this.state = new NoCoinState();
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void pullLever() {
        state.pullLever(this);
    }

    public void collectWin() {
        state.collectWin(this);
    }

    public void currentState() {
        state.currenState(this);
    }

}
