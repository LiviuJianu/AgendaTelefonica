package com.java.agenda.model;

public class Abonat {

    private String id;
    private String nume;
    private String prenume;
    private String cnp;
    private NrTelefon numarTelefon;

    public Abonat(String id, String numeAbonat, String prenumeAbonat, String cnpAbonat, NrTelefon telefonAbonat) {
        this.id = id;
        nume = numeAbonat;
        prenume = prenumeAbonat;
        cnp = cnpAbonat;
        numarTelefon = telefonAbonat;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Abonat abonat = (Abonat) o;

        if (id != null ? !id.equals(abonat.id) : abonat.id != null) return false;
        if (nume != null ? !nume.equals(abonat.nume) : abonat.nume != null) return false;
        if (prenume != null ? !prenume.equals(abonat.prenume) : abonat.prenume != null) return false;
        if (cnp != null ? !cnp.equals(abonat.cnp) : abonat.cnp != null) return false;
        return numarTelefon != null ? numarTelefon.equals(abonat.numarTelefon) : abonat.numarTelefon == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nume != null ? nume.hashCode() : 0);
        result = 31 * result + (prenume != null ? prenume.hashCode() : 0);
        result = 31 * result + (cnp != null ? cnp.hashCode() : 0);
        result = 31 * result + (numarTelefon != null ? numarTelefon.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Abonat [nume=" + getNume() + ", prenume=" + getPrenume() + ", cnp=" + getCnp()
                + ", numarTelefon=" + getNumarTelefon() + "]\n";
    }

}