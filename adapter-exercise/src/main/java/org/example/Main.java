package org.example;

import org.example.api.LibraryAPI;
import org.example.api.LibraryAPIImpl;
import org.example.api.LibraryAPIv2;
import org.example.api.LibraryAPIv2Impl;

public class Main {
    public static void main(String[] args) {

        LibraryAPI api = new LibraryAPIImpl();
        User user = new User("Jan","Kowalski","32131212");
        BookConnector connector = new BookConnector(user, api);
        connector.checkAvailability("Harry Potter i Zakon Feniksa");

        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        connector = new BookConnector(user, apiAdapter);
        connector.checkAvailability("Harry Potter i Zakon Feniksa");



    }
}