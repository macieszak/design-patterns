package org.example;

public class User {

    private String name;
    private String lastName;
    private String PESEL;

    public User(String name, String lastName, String PESEL) {
        this.name = name;
        this.lastName = lastName;
        this.PESEL = PESEL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

}
