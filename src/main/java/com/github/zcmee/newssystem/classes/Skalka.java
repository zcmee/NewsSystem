package com.github.zcmee.newssystem.classes;

public class Skalka {
    private String login;

    public Skalka() {
    }

    public Skalka(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Skalka{" +
                "login='" + login + '\'' +
                '}';
    }

}
