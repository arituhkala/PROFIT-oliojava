package java1;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * @author Ari Tuhkala
 *
 */

public class SimpleGraphics {

	/**
	 * 
	 * @param args
	 *            not in use
	 */
	public static void main(String[] args) {
		EasyWindow window = new EasyWindow();
		window.addLine(0, 0, 100, 100);
		window.addCircle(50, 50, 20);
	}
}