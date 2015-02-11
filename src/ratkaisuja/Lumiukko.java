package ratkaisuja;

import fi.jyu.mit.graphics.*;

import java.math.*;
import java.util.Random;

/**
 * Harjoitellaan piirtelyÃ¤ ja kuormittamista
 * 
 * @author Ari Tuhkala
 *
 */
public class Lumiukko {

	/**
	 * PiirtÃ¤Ã¤ lumiukon annettuun paikkaan
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

		double pikkuPallonY = y + isonPallonSade + 2 * keskipallonSade
				+ pikkupallonSade;

		w.addCircle(x, y, isonPallonSade); // piirtÃ¤Ã¤ ison pallon
		w.addCircle(x, keskiPallonY, keskipallonSade); // piirtÃ¤Ã¤ keskipallon
		w.addCircle(x, pikkuPallonY, pikkupallonSade); // piirtÃ¤Ã¤ pikkupallon

	}

	public void piirraLumiukko(EasyWindow w, double x, double y) {
		this.piirraLumiukko(w, x, y, 35, 25, 10);
	}

	public void piirraLumiukko(EasyWindow w, double x, double y,
			double isonPallonSade) {
		double keskipallonSade = 25.0 * isonPallonSade / 35.0;
		double pikkupallonSade = 10.0 * isonPallonSade / 35.0;
		this.piirraLumiukko(w, x, y, isonPallonSade, keskipallonSade,
				pikkupallonSade);
	}

	public void piirraLumiukko(EasyWindow w, double x, double y,
			double isonPallonSade, double keskipallonSade) {
		double pikkupallonSade = keskipallonSade * keskipallonSade
				/ isonPallonSade;
		this.piirraLumiukko(w, x, y, isonPallonSade, keskipallonSade,
				pikkupallonSade);
	}

	public void piirraLumiukko(EasyWindow w, Piste piste, double isonPallonSade, double keskipallonSade, double pikkupallonSade) {	
		piste.moveX(isonPallonSade);
		piste.moveY(isonPallonSade);
		w.addCircle(piste.getX(), piste.getY(), isonPallonSade);
		piste.moveY(isonPallonSade + keskipallonSade);
		w.addCircle(piste.getX(), piste.getY(), keskipallonSade);
		piste.moveY(keskipallonSade + pikkupallonSade);
		w.addCircle(piste.getX(), piste.getY(), pikkupallonSade);
		piste.moveY(pikkupallonSade);
		piste.moveX(isonPallonSade);
	}

	public static void main(String[] args) {

		// Luodaan uusi ikkuna
		EasyWindow window = new EasyWindow();
		window.scale(0, 0, 3000, 3000);

		// Luodaan lumiukko-olio
		Lumiukko lumiukko = new Lumiukko();

		// Luodaan piste
		Piste piste = new Piste(0,0);

		// Piirretään yksi lumiukko
		//lumiukko.piirraLumiukko(window, piste, 35, 25, 10);
		//lumiukko.piirraLumiukko(window, piste, 35, 25, 10);
		
		/**
		
		// Piirretään lumiukkoja Y-akselille
		
		Random satunnaisluku = new Random();
		for (int i = 0; i < 100; i++) {
			lumiukko.piirraLumiukko(
					window,
					piste,
					satunnaisluku.nextInt(100),
					satunnaisluku.nextInt(50),
					satunnaisluku.nextInt(20));
		}
		**/
		
		// Piirretään lumiukkoja X-akselille
		
		Random satunnaisluku = new Random();
		for (int i = 0; i < 200; i++) {
			lumiukko.piirraLumiukko(
					window,
					piste,
					satunnaisluku.nextInt(100),
					satunnaisluku.nextInt(50),
					satunnaisluku.nextInt(20));
			
			piste.setY(0);
			
			}
		
		

		// Näytetään ikkuna
		window.showWindow();
	}

}
