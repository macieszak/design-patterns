package org.example;

import org.example.message.Message;
import org.example.officer.Officer;

public class Main {
    public static void main(String[] args) {

        Message message = new Message("Atakować!");
        Officer officer = new Officer();
        officer.setCaptain(true);
        officer.receiveMessage(message);

    }
}