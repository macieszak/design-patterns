package org.example;

import org.example.api.LibraryAPI;

public class BookConnector {

    private final User user;
    private final LibraryAPI api;

    public BookConnector(User user, LibraryAPI api) {
        this.user = user;
        this.api = api;
    }

    public boolean checkAvailability(String title) {
        return api.isAvailable(title);
    }

}
