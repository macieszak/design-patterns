package org.example;

import org.example.message.Message;
import org.example.officer.*;

public class Main {
    public static void main(String[] args) {

        Message message = new Message("Atakować!", 200, OfficerRank.GENERAL);
        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);

    }
}