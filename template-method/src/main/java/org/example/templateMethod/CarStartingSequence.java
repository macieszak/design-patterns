package org.example.templateMethod;

public abstract class CarStartingSequence {

    public final void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    protected abstract void setTheGear();

    protected abstract void startTheIgnition();

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasy");
    }

}
