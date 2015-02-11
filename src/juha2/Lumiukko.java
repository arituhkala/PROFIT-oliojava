package juha2;

import fi.jyu.mit.graphics.*;

/**
 * Harjoitellaan piirtely� ja kuormittamista
 * 
 * @author Ari Tuhkala
 *
 */
public class Lumiukko {

	/**
	 * Piirt�� lumiukon annettuun paikkaan
	 * 
	 * @param w
	 * @param x
	 * @param y
	 * @param isonPallonSade
	 * @param keskipallonSade
	 * @param pikkupallonSade
	 */
	public void piirraLumiukko(EasyWindow w, double x, double y,
			double isonPallonSade, double keskipallonSade,
			double pikkupallonSade) {

		double keskiPallonY = y + isonPallonSade + keskipallonSade;
		double pikkuPallonY = keskiPallonY + keskipallonSade + pikkupallonSade;

		w.addCircle(x, y, isonPallonSade); // piirt�� ison pallon
		w.addCircle(x, keskiPallonY, keskipallonSade); // piirt�� keskipallon
		w.addCircle(x, pikkuPallonY, pikkupallonSade); // piirt�� pikkupallon
	}

	/**
	 * Piirt�� lumiukon annettuun paikkaan
	 * 
	 * @param w
	 * @param x
	 * @param y
	 * @param isonPallonSade
	 * @param keskipallonSade
	 */
	public void piirraLumiukko(EasyWindow w, double x, double y,
			double isonPallonSade, double keskipallonSade) {
		piirraLumiukko(w, x, y, isonPallonSade, keskipallonSade, 10);
	}

	/**
	 * Piirt�� lumiukon annettuun paikkaan
	 * 
	 * @param w
	 * @param x
	 * @param y
	 * @param isonPallonSade
	 */
	public void piirraLumiukko(EasyWindow w, double x, double y,
			double isonPallonSade) {
		piirraLumiukko(w, x, y, isonPallonSade, 25);
	}

	/**
	 * Piirt�� lumiukon annettuun paikkaan
	 * 
	 * @param w
	 * @param x
	 * @param y
	 */
	public void piirraLumiukko(EasyWindow w, double x, double y) {
		piirraLumiukko(w, x, y, 35);
	}

	public static void main(String[] args) {
		// Luodaan uusi ikkuna
		EasyWindow window = new EasyWindow();

		window.scale(0, 0, 1000, 1000);

		// Luodaan lumiukko-olio
		Lumiukko lumiukko = new Lumiukko();

		// Piirret��n lumiukko (ikkuna, johon piirret��n,x,y,alimman pallon
		// s�de, keskipallon s�de, ylimm�n pallon s�de)
		lumiukko.piirraLumiukko(window, 100, 100, 35, 25, 10);

		/**
		 * Pist� alla olevat toimimaan
		 */
		lumiukko.piirraLumiukko(window, 500, 100); // piirt�� standardikokoisen
													// lumiukon
		lumiukko.piirraLumiukko(window, 400, 100, 35);
		lumiukko.piirraLumiukko(window, 300, 100, 35, 25);
		lumiukko.piirraLumiukko(window, 200, 100, 35, 25, 10);

		// N�ytet��n ikkuna
		window.showWindow();
	}

}
