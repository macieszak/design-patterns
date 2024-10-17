package org.example;

public class MyDay extends WeekDay {

    @Override
    protected void work() {
        System.out.println("Code monkey get up, get coffee");
    }

    public int goToWork(TransportType transport) {
        return switch (transport) {
            case CAR -> 15;
            case BIKE -> 25;
            case TRAM -> 20;
            default -> 20;
        };
    }

}
