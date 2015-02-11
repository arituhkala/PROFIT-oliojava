package markob;

import fi.jyu.mit.graphics.*;

/**
 * Portaat-luokka, joka osaa piirt�� portaita yl�s ja alas.
 * 
 * @author Marko Back
 * @version 1.0
 */
public class Portaat {

	public void porrasYlos(EasyWindow window, double x, double y) {
		window.addLine(x, y, x, y + 1);
		window.addLine(x, y + 1, x + 1, y + 1);
	}

	public void porrasAlas(EasyWindow window, double x, double y) {
		window.addLine(x, y, x, y - 1);
		window.addLine(x, y - 1, x + 1, y - 1);
	}

	/**
	 * Piirt�� portaat yl�s ja alas
	 * 
	 * @param window
	 *            ikkuna, johon piirret��n
	 * @param portaidenLkm
	 *            montako porrasta piirret��n yl�s ja alas
	 */
	public void piirraPortaat(EasyWindow window, int portaidenLkm) {

		for (int i = 0; i < portaidenLkm; i++) {
			porrasYlos(window, i, i);
		}

		for (int j = 0; j < portaidenLkm; j++) {
			porrasAlas(window, portaidenLkm + j, portaidenLkm - j);
		}
	}

	/**
	 * @param args
	 *            ei k�yt�ss�
	 */
	public static void main(String[] args) {
		Portaat portaat = new Portaat();
		EasyWindow window = new EasyWindow();
		window.scale(0, 0, 15, 15);

		portaat.piirraPortaat(window, 6);
		window.showWindow();
	}

}