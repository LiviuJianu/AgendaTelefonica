package com.java.contacts.model;

public class Contact {

    private String id;
    private String nume;
    private String prenume;
    private String cnp;
    private Phone numarTelefon;

    public Contact(String numeAbonat, String prenumeAbonat, String cnpAbonat, Phone telefonAbonat) {
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

    public Phone getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(Phone numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (id != null ? !id.equals(contact.id) : contact.id != null) return false;
        if (nume != null ? !nume.equals(contact.nume) : contact.nume != null) return false;
        if (prenume != null ? !prenume.equals(contact.prenume) : contact.prenume != null) return false;
        if (cnp != null ? !cnp.equals(contact.cnp) : contact.cnp != null) return false;
        return numarTelefon != null ? numarTelefon.equals(contact.numarTelefon) : contact.numarTelefon == null;

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
        return "Contact [nume=" + getNume() + ", prenume=" + getPrenume() + ", cnp=" + getCnp()
                + ", numarTelefon=" + getNumarTelefon() + "]\n";
    }

}