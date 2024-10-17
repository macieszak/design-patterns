package org.example;

public abstract class WeekDay {

    public final void everyDayIsExactlyTheSame(TransportType transport) {
        wakeUp();
        getReady();
        int time = goToWork(transport);
        summary(time);
        work();
        goHome();
    }

    protected abstract void work();

    protected abstract int goToWork(TransportType transport);

    private void goHome() {
        System.out.println("Powrot do domu");
    }

    protected void summary(int time) {
        System.out.println("Trasa do pracy zajęła: " + time + " minut");
    }

    private void getReady() {
        System.out.println("Przygotowania do wyjscia");
    }

    private void wakeUp() {
        System.out.println("Pobudka");
    }

}



