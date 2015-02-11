package terhi;

/**
 * Toteuta luokka LinjaAuto, jossa on ominaisuudet paikkojen lukum��r� ja
 * vapaiden paikkojen lukum��r�. Tee metodit tulosta (vrt. Henkilo-teht�v�) sek�
 * lisaa ja vahenna muuttamaan matkustajien lukum��r��. Kirjoita
 * testip��ohjelma.
 */

public class LinjaAuto {
	private int paikkoja;
	private int vapaitaPaikkoja;

	/**
	 * Konstruktori
	 * 
	 * @param p
	 * @param vp
	 */
	public LinjaAuto(int p, int vp) {
		paikkoja = p;
		vapaitaPaikkoja = vp;
	}

	/**
	 * @param la
	 * 
	 */
	public void tulosta(LinjaAuto la) {
		System.out.println("Linja-autossa paikkoja:" + la.paikkoja
				+ "\nLinja-autossa vapaita paikkoja:" + la.vapaitaPaikkoja);
	}

	/**
	 * @param la
	 * @param lisays
	 * 
	 */
	public void lisaaMatkustajia(LinjaAuto la, int lisays) {
		la.vapaitaPaikkoja = la.vapaitaPaikkoja - lisays;
	}

	/**
	 * @param la
	 * @param vahennys
	 * 
	 */
	public void vahennaMatkustajia(LinjaAuto la, int vahennys) {
		la.vapaitaPaikkoja = la.vapaitaPaikkoja + vahennys;
	}

	/**
	 * main testausta varten
	 * 
	 * @param args
	 * 
	 */

	public static void main(String[] args) {

		LinjaAuto linkki = new LinjaAuto(52, 20);
		// testi tulosta
		linkki.tulosta(linkki);
		// testi lisaaMatkustajia
		int i = 2;
		System.out.println("\nLis�t��n " + i + " matkustajaa");
		linkki.lisaaMatkustajia(linkki, i);
		linkki.tulosta(linkki);
		// testi vahennaMatkustajia
		int j = 10;
		System.out.println("\nV�hennet��n " + j + " matkustajaa");
		linkki.vahennaMatkustajia(linkki, j);
		linkki.tulosta(linkki);

	}

}
