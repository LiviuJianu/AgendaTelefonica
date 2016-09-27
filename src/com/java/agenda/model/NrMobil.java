package com.java.agenda.model;

public class NrMobil extends NrTelefon {

    private String mobil;

    public NrMobil(String mobil) {
        super(mobil);
        this.mobil = mobil;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    @Override
    public String toString() {
        return mobil;
    }

}
