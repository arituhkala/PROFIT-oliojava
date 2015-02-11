package matti_tammio;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * Ohjelma piirt�� viisi porrasta alkaen origosta p��ttyen pisteesen (5,5)
 * 
 * @author // Matti Tammio
 * @version // 0.1
 */
public class Portaat {

	/**
	 * Aliohjelma piirt�� ikkunaan yhden nousevan portaan alkaen pisteest� (x,y)
	 * ja p��ttyen pisteeseen (x+1,y+1)
	 * 
	 * <pre>
	 *    |-------(x+1,y+1)
	 *    |
	 *    |
	 *    |
	 *   (x,y)
	 * </pre>
	 * 
	 * @param window
	 * @param x
	 *            portaan alkupisteen x
	 * @param y
	 *            portaan alkupisteen y
	 */
	public static void porrasYlos(EasyWindow window, double x, double y) {
		// T�ydenn� t�h�n
	}

	/**
	 * @param args
	 *            ei k�yt�ss�
	 */
	public static void main(String[] args) {
		EasyWindow window = new EasyWindow();
		window.scale(0, 0, 20, 20);
		// Kaksi porrasta yl�s
		porrasYlos(window, 0, 0);
		porrasYlos(window, 1, 1);

		// Sitten alas
		// porrasAlas(window,5,5);
		// porrasAlas(window,4,4);

		// Ja lopulta metodi, joka piirt�� halutun m��r�n portaita alkaen
		// tietyst� koordinaatista
		// piirraPortaat(window,3,3,7);
		// eli piirraPortaat(ikkuna johon piirret��n, x-koord, y-koord, montako
		// porrasta
		window.showWindow();
	}
}