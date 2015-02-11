package terhi;

/**
 * 
 * @author Terhi J�rvenp��
 *
 */

public class Henkilo {

	/** Etunimi */
	private String etunimi;

	/** Sukunimi */
	private String sukunimi;

	/** Syntym�vuosi */
	private int syntymavuosi;

	/**
	 * Konstruktori
	 * 
	 * @param etunimi
	 * @param sukunimi
	 * @param syntymavuosi
	 */
	public Henkilo(String etunimi, String sukunimi, int syntymavuosi) {
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.syntymavuosi = syntymavuosi;
	}

	/**
	 * palauttaa etunimen ja sukunimen
	 * 
	 * @return kokoNimi
	 */
	public String getNimi() {
		String kokoNimi;
		kokoNimi = etunimi + " " + sukunimi;
		return kokoNimi;
	}

	/**
	 * palauttaa etunimen
	 * 
	 * @return etunimi
	 */
	public String getEtunimi() {

		return etunimi;
	}

	/**
	 * palauttaa sukunimen
	 * 
	 * @return sukunimi
	 */
	public String getSukunimi() {

		return sukunimi;
	}

	/**
	 * Palauttaa syntym�vuoden
	 * 
	 * @return syntymavuosi
	 */
	public int getSyntymavuosi() {
		return syntymavuosi;
	}

	/**
	 * lisaa | merkin
	 * 
	 * @param h
	 * @return kokoOlio
	 */
	public String toString(Henkilo h) {
		String kokoOlio;
		kokoOlio = h.getEtunimi() + "|" + h.getSukunimi() + "|"
				+ h.getSyntymavuosi();
		return kokoOlio;

	}

	/**
	 * main testausta varten
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
		System.out.println(aku.getNimi()); // tulostaa Aku Ankka
		System.out.println(aku.getSyntymavuosi()); // tulostaa 1934
		System.out.println(aku.toString(aku)); // tulostaa Aku|Ankka|1934

	}

}
