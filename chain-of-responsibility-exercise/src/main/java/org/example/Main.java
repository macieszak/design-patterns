package org.example;

import org.example.children.*;
import org.example.request.MotherRequest;

public class Main {
    public static void main(String[] args) {

        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);

        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();

        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);

        tomek.processRequest(motherRequest);

    }
}