package org.example.api;

public class LibraryAPIImpl implements LibraryAPI {

    @Override
    public boolean isAvailable(String title) {
        System.out.println("Oryginalne API sprawdza dostępność:  " + title);
        return true;
    }

}
