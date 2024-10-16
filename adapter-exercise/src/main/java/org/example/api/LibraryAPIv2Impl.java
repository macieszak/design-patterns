package org.example.api;

public class LibraryAPIv2Impl implements LibraryAPIv2 {

    @Override
    public boolean isAvailableLibraryAPIv2() {
        System.out.println("API v2 działa i szuka książki...");
        return true;
    }

}
