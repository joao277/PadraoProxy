package com.example;

public class GM {
    private String login;
    private boolean validado;

    public GM(String login, boolean validado) {
        this.login = login;
        this.validado = validado;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

}