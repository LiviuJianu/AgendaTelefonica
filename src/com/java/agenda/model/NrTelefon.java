package com.java.agenda.model;

public abstract class NrTelefon {

    private String numar;

    public NrTelefon(String numar) {
        this.numar = numar;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return numar;
    }


}