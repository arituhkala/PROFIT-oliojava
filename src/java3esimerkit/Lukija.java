package java3esimerkit;

import java.io.*;

/**
 * N�pp�imist�lt� tietoa lukeva luokka. Piilottaa n�pp�imist�lt� lukuun
 * liittyv�n monimutkaisuuden, kuten tietovirrat ja poikkeukset. Metodit tekev�t
 * valmiiksi tyyppimuunnoksia ja kysyv�t tiedon uudelleen, jos k�ytt�j� on
 * sy�tt�nyt merkkijonon, jota ei saada muunnettua kyseisen tyypin muuttujan
 * arvoksi.
 *
 * @author Mika Vesterholm
 * @version 2.0
 */
public class Lukija {
	/** Tietovirta, josta merkkijonoja luetaan. Lukee merkit System.in virrasta. */
	private static BufferedReader in;

	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Lukee k�ytt�j�lt� yhden merkkijonon. Lopettaa ohjelman suorituksen
	 * kokonaan virhetilanteessa.
	 * 
	 * @return Luetun merkkijonon.
	 */
	public static String lueRivi() {
		return lueRivi(null);
	}

	public static String lueRivi(String kysymys) {
		if (kysymys != null)
			System.out.println(kysymys + ":");

		while (true) {
			try {
				return in.readLine();
			} catch (IOException ex) {
				System.out
						.println("Virhe merkkijonoa luettaessa. Yrit� uudelleen.");
				System.err.println(ex.getMessage());
				System.exit(1); // Lopetetaan ohjelman suoritus kokonaan.
			}
		}
	}

	/**
	 * Lukee k�ytt�j�lt� yhden kokonaisluvun ja palauttaa sen int-tyyppisen�.
	 * Jos k�ytt�j� sy�tt�� merkkijonon, jota ei voida tulkita kokonaisluvuksi,
	 * kysyy tietoa uudelleen kunnes k�ytt�j� sy�tt�� kunnollisen merkkijonon.
	 * 
	 * @return Luetun kokonaisluvun.
	 */
	public static int lueInt() {
		return lueInt(null);
	}

	public static int lueInt(String kysymys) {
		while (true) {
			try {
				return Integer.parseInt(lueRivi(kysymys));
			} catch (NumberFormatException ex) {
				System.out.println("Sy�t� kokonaisluku:");
			}
		}
	}

	public static Integer lueInteger() {
		return lueInteger(null);
	}

	public static Integer lueInteger(String kysymys) {
		try {
			return new Integer(lueRivi(kysymys));
		} catch (NumberFormatException ex) {
			return null;
		}
	}

	/**
	 * Lukee k�ytt�j�lt� yhden kokonaisluvun ja palauttaa sen long-tyyppisen�.
	 * Jos k�ytt�j� sy�tt�� merkkijonon, jota ei voida tulkita kokonaisluvuksi,
	 * kysyy tietoa uudelleen kunnes k�ytt�j� sy�tt�� kunnollisen merkkijonon.
	 * 
	 * @return Luetun kokonaisluvun.
	 */
	public static long lueLong() {
		while (true) {
			try {
				return Long.parseLong(lueRivi());
			} catch (NumberFormatException ex) {
				System.out.println("Sy�t� kokonaisluku:");
			}
		}
	}

	/**
	 * Lukee k�ytt�j�lt� yhden desimaaliluvun ja palauttaa sen float-tyyppisen�.
	 * Jos k�ytt�j� sy�tt�� merkkijonon, jota ei voida tulkita desimaaliluvuksi,
	 * kysyy tietoa uudelleen kunnes k�ytt�j� sy�tt�� kunnollisen merkkijonon.
	 * 
	 * @return Luetun desimaaliluvun.
	 */
	public static float lueFloat() {
		while (true) {
			try {
				return Float.parseFloat(lueRivi());
			} catch (NumberFormatException ex) {
				System.out.println("Sy�t� reaaliluku:");
			}
		}
	}

	/**
	 * Lukee k�ytt�j�lt� yhden desimaaliluvun ja palauttaa sen
	 * double-tyyppisen�. Jos k�ytt�j� sy�tt�� merkkijonon, jota ei voida
	 * tulkita desimaaliluvuksi, kysyy tietoa uudelleen kunnes k�ytt�j� sy�tt��
	 * kunnollisen merkkijonon.
	 * 
	 * @return Luetun desimaaliluvun.
	 */
	public static double lueDouble() {
		return lueDouble(null);
	}

	public static double lueDouble(String kysymys) {
		while (true) {
			try {
				return Double.parseDouble(lueRivi(kysymys));
			} catch (NumberFormatException ex) {
				System.out.println("Sy�t� reaaliluku:");
			}
		}
	}

}