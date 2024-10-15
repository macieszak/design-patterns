package org.example;

import org.example.adapter.ContinentalDevice;
import org.example.adapter.ContinentalSocket;
import org.example.adapter.UKDevice;
import org.example.adapter.UKSocket;

public class Main {
    public static void main(String[] args) {

        ContinentalDevice radio  = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("Gra muzyka");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("Music plays");
            }
        };

        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukRadio);

        //continentalSocket.plugIn(ukRadio);

    }
}