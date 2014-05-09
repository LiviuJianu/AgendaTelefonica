package agenda;

/**
 * Obiect NumarFix extinde NumarTelefon
 * @author Liviu Jianu
 */
public class NrFix extends NrTel {
	
	private String fix;

    /**
     * Constructor
     * @param fix sir de caractere care reprezinta numarul de telefon fix
     */
    public NrFix(String fix) {
		super(fix);
		this.fix = fix;
	}

    /**
     * Getter
     * @return fix Numar de telefon fix
     */
    public String getFix() {
		return fix;
	}

    /**
     * Setter
     * @param fix Modificare numar de telefon fix
     */
    public void setFix(String fix) {
		this.fix = fix;
	}
	
    /**
     * Afisare formatata a numarului de telefon
     * @return fix numarul de telefon fix
     */
    @Override
	public String toString() {
		return fix;
	}

}
