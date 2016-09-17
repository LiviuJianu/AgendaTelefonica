package com.java.agenda.model;

/**
 * Obiect de tip <code>Abonat</code>
 * Orice Abonat are Nume, CNP si un Numar de telefon care este de tip NrTel
 *
 * @author Liviu Jianu
 */
public class Abonat {

    private String nume;
    private String prenume;
    private String cnp;
    private NrTelefon numarTelefon;

    /**
     * Constructor <code>Abonat(numeAbonat,prenumeAbonat,cnpAbonat,telefonAbonat)</code>
     * va fi construit cu parametri initiali
     *
     * @param numeAbonat    Numele abonatului
     * @param prenumeAbonat Prenumele abonatului
     * @param cnpAbonat     CNP-ul abonatului
     * @param telefonAbonat Telefonul abonatului
     */
    public Abonat(String numeAbonat, String prenumeAbonat, String cnpAbonat, NrTelefon telefonAbonat) {
        nume = numeAbonat;
        prenume = prenumeAbonat;
        cnp = cnpAbonat;
        numarTelefon = telefonAbonat;

    }

    /**
     * Getter
     *
     * @return nume Nume abonat
     */
    public String getNume() {
        return nume;
    }

    /**
     * Setter
     *
     * @param nume Modificare nume abonat
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * Getter
     *
     * @return prenume Prenume abonat
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * Setter
     *
     * @param prenume Modificare prenume abonat
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    /**
     * Getter CNP
     *
     * @return cnp CNP abonat
     */
    public String getCnp() {
        return cnp;
    }

    /**
     * Setter CNP
     *
     * @param cnp Modificare numar CNP
     */
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    /**
     * Getter
     *
     * @return numarTelefon Numar de telefon
     */
    public NrTelefon getNumarTelefon() {
        return numarTelefon;
    }

    /**
     * Setter
     *
     * @param numarTelefon Modificare numar de telefon
     */
    public void setNumarTelefon(NrTelefon numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    /**
     * Metoda <code>toString()</code> suprascrisa
     *
     * @return formatare noua a obiectului
     */
    @Override
    public String toString() {
        return "Abonat [nume=" + getNume() + ", prenume=" + getPrenume() + ", cnp=" + getCnp()
                + ", numarTelefon=" + getNumarTelefon() + "]\n";
    }

}