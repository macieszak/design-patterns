package org.example.adapter;

public class TwoWayAdapter implements UKDevice, ContinentalDevice {

    private UKDevice ukDevice;
    private ContinentalDevice continentalDevice;

    public TwoWayAdapter(UKDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        continentalDevice.on();
    }

}
