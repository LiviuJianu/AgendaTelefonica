package agenda;

/**
 * Clasa de construire a obiectelor de tip NrTel
 * <p>Verificare tipului de numar intors si intoarcerea
 * unui obiect corespunzator de tip NrMobil sau de tip NrFix</p>
 * @author Liviu Jianu
 */

public class TipNumarTelefon {
	
	private static final int LUNGIME_NUMAR = 10;
	private static final String identificareNumarFix = "02";
	private static final String identificareNumarMobil = "07";

        /**
         * 
         * @param numarTel sir de caractere care reprezinta numarul de telefon
         * in urma caruia se va construi un obiect de tip NrFix sau NrMobil
         * @return Obiect tip numarTelefon in functie de formatul numarului
         * @throws Exception exceptie in cazul in care numarul de telefon 
         * introdus este incorect.
         */
	public NrTel getTipNumarTel(String numarTel) throws Exception {
		if((numarTel==null) || (numarTel.length() != LUNGIME_NUMAR)) {
			throw new Exception("Formatul numarului introdus este incorect!");
		}
		
		
		if(numarTel.startsWith(identificareNumarMobil)){
			return new NrMobil(numarTel);
		} else if(numarTel.startsWith(identificareNumarFix)){
			return new NrFix(numarTel);
		} else {
			throw new Exception("Formatul numarului introdus este incorect!");
		}
	}
}
