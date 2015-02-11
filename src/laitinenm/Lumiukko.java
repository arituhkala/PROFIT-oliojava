package laitinenm;

import fi.jyu.mit.graphics.*;
import laitinenm.Piste;

/**
 * Harjoitellaan piirtely� ja kuormittamista
 * 
 * @author Ari Tuhkala
 *
 */
public class Lumiukko {

	/**
	 * Piirt�� standardikokoisen lumiukon annettuun paikkaan
	 * 
	 * @param w
	 * @param x
	 * @param y
	 */
	public void piirraLumiukko(EasyWindow w, double x, double y) {

		piirraLumiukko(w, x, y, 35, 25, 10);

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

		piirraLumiukko(w, x, y, isonPallonSade, 25, 10);

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
	 * @param keskipallonSade
	 * @param pikkupallonSade
	 */
	public void piirraLumiukko(EasyWindow w, double x, double y,
			double isonPallonSade, double keskipallonSade,
			double pikkupallonSade) {

		double keskiPallonY = y + isonPallonSade + keskipallonSade; // ratkaise
																	// t�h�n
																	// keskiPallonY
		double pikkuPallonY = keskiPallonY + keskipallonSade + pikkupallonSade; // ratkaise
																				// t�h�n
																				// pikkuPallonY

		w.addCircle(x, y, isonPallonSade); // piirt�� ison pallon
		w.addCircle(x, keskiPallonY, keskipallonSade); // piirt�� keskipallon
		w.addCircle(x, pikkuPallonY, pikkupallonSade); // piirt�� pikkupallon

	}

	public void piirraLumiukko(EasyWindow w, Piste piste,
			double isonPallonSade, double keskipallonSade,
			double pikkupallonSade) {

		w.addCircle(piste.getX(), piste.getY(), isonPallonSade); // piirt�� ison
																	// pallon
		piste.setY(piste.getY() + isonPallonSade + keskipallonSade);

		w.addCircle(piste.getX(), piste.getY(), keskipallonSade); // piirt��
																	// keskipallon
		piste.setY(piste.getY() + keskipallonSade + pikkupallonSade);

		w.addCircle(piste.getX(), piste.getY(), pikkupallonSade); // piirt��
																	// pikkupallon

	}

	/**
	 * @param args
	 *            ei k�yt�ss�
	 */
	public static void main(String[] args) {
		// Luodaan uusi ikkuna
		EasyWindow window = new EasyWindow();

		window.scale(0, 0, 1000, 1000);

		// Luodaan lumiukko-olio
		Lumiukko lumiukko = new Lumiukko();

		// Piirret��n lumiukko (ikkuna, johon piirret��n,x,y,alimman pallon
		// s�de, keskipallon s�de, ylimm�n pallon s�de)
		// lumiukko.piirraLumiukko(window,100,100,35,25,10);

		/**
		 * Pist� alla olevat toimimaan
		 **/
		/*
		 * double x = 100; double y = 100; double isonPallonSade = 35; double
		 * keskiPallonSade = 25; double pienenPallonSade = 10; double vali =
		 * isonPallonSade+isonPallonSade+pienenPallonSade;
		 * 
		 * lumiukko.piirraLumiukko(window, x+=vali, y);
		 * lumiukko.piirraLumiukko(window, x+=vali, y, isonPallonSade);
		 * lumiukko.piirraLumiukko(window, x+=vali, y, isonPallonSade,
		 * keskiPallonSade); lumiukko.piirraLumiukko(window, x+=vali, y,
		 * isonPallonSade, keskiPallonSade, pienenPallonSade);
		 */

		// Luodaan piste-olio
		Piste piste = new Piste(100, 100);
		lumiukko.piirraLumiukko(window, piste, 35, 25, 10);

		piste.setXY(300, 200);
		lumiukko.piirraLumiukko(window, piste, 35, 25, 10);

		piste.setXY(200, 300);
		lumiukko.piirraLumiukko(window, piste, 35, 25, 10);

		// N�ytet��n ikkuna
		window.showWindow();
	}

}
