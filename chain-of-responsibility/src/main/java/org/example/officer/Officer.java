package org.example.officer;

import org.example.message.Message;

public class Officer {

    private boolean sergeant;
    private boolean captain;
    private boolean general;

    public void receiveMessage(Message message) {
        if (sergeant) {
            System.out.println("Sierżant otrzymał wiadomość: " + message.getContent());
        } else if (captain) {
            System.out.println("Kapitan otrzymał wiadomość: " + message.getContent());
        } else if (general) {
            System.out.println("Generał otrzymał wiadomość: " + message.getContent());
        } else {
            System.out.println("Zły adrest wiadomości!");
        }
    }

    public void setSergeant(boolean sergeant) {
        this.sergeant = sergeant;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }

}
