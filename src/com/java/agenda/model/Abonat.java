package com.java.agenda.model;

public class Abonat {

    private String nume;
    private String prenume;
    private String cnp;
    private NrTelefon numarTelefon;

    public Abonat(String numeAbonat, String prenumeAbonat, String cnpAbonat, NrTelefon telefonAbonat) {
        nume = numeAbonat;
        prenume = prenumeAbonat;
        cnp = cnpAbonat;
        numarTelefon = telefonAbonat;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public NrTelefon getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(NrTelefon numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public String toString() {
        return "Abonat [nume=" + getNume() + ", prenume=" + getPrenume() + ", cnp=" + getCnp()
                + ", numarTelefon=" + getNumarTelefon() + "]\n";
    }

}