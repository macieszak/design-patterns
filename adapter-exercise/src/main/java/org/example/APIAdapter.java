package org.example;

import org.example.api.LibraryAPI;
import org.example.api.LibraryAPIv2;

public class APIAdapter implements LibraryAPI {

    private LibraryAPIv2 libraryAPIv2;
    private User user;

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String title) {
        return libraryAPIv2.isAvailableLibraryAPIv2();
    }

}
