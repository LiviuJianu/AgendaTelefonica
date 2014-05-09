package agenda;

/**
 * Obiect NumarMobil extinde NumarTelefon
 * @author Liviu Jianu
 */
public class NrMobil extends NrTel{

	private String mobil;
	
    /**
     * Constructor
     * @param mobil sir de caractere care reprezinta numarul de telefon mobil
     */
    public NrMobil(String mobil) {
		super(mobil);
		this.mobil = mobil;
	}

    /**
     * Getter
     * @return mobil Numarul de telefon
     */
    public String getMobil() {
		return mobil;
	}

    /**
     * Setter
     * @param mobil Modificare numar de mobil
     */
    public void setMobil(String mobil) {
		this.mobil = mobil;
	}

    /**
     * Afisare formatata a numarului de telefon
     * @return mobil numarul de telefon mobil
     */
    @Override
	public String toString() {
		return mobil;
	}

}
