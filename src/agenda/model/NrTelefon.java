package agenda;

/**
 * Obiect NumarTelefon - clasa parinte pentru <code>NrFix</code> si <code>NrMobil</code>
 *
 * @author Liviu Jianu
 */
public abstract class NrTelefon {

    private String numar;

    /**
     * Constructor
     *
     * @param numar sir de caractere care reprezinta numarul de telefon generic
     */
    public NrTelefon(String numar) {
        this.numar = numar;
    }

    /**
     * Getter
     *
     * @return numar Numarul de telefon
     */
    public String getNumar() {
        return numar;
    }

    /**
     * Setter
     *
     * @param numar Modificare numar de telefon
     */
    public void setNumar(String numar) {
        this.numar = numar;
    }

    /**
     * Afisare formatata a numarului de telefon
     *
     * @return numar numarul de telefon
     */
    @Override
    public String toString() {
        return numar;
    }


}