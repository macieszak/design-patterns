import state.SlotMachine;

public class Main {

    public static void main(String[] args) {

        SlotMachine slotMachine = new SlotMachine();

        slotMachine.insertCoin();
        slotMachine.currentState();
        slotMachine.pullLever();
        slotMachine.currentState();
        slotMachine.collectWin();
        slotMachine.currentState();

    }

}
