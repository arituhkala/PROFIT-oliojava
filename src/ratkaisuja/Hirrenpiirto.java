package ratkaisuja;

import fi.jyu.mit.graphics.*;
import fi.jyu.mit.ohj2.Syotto;

/**
 * Luokka hirsipuun piirt�miseksi
 * 
 * @author vesal
 * @version 21.10.2008
 */
public class Hirrenpiirto {

	private static final BasicShape[] hirrenOsat = { new Circle(0, 0, 1),
			new Line(0, 1, 0, 7), new Line(0, 7, 3, 7), new Line(3, 7, 3, 6),
			new Circle(3, 5.5, 0.5), new Line(3, 5, 3, 3),
			new Line(3, 3, 2, 1), new Line(3, 3, 4, 1),
			new Line(2, 4.5, 4, 4.5) };

	final private Window ikkuna;
	private int vaihe = 0;

	public Hirrenpiirto(int n) {
		ikkuna = new Window(400, 400);
		ikkuna.move(3, 0, 0);
		ikkuna.scale(0, 0, 10, 10);
		ikkuna.showWindow();
		for (int i = 0; i < n; i++)
			ikkuna.add(hirrenOsat[i]);
		vaihe = n;
	}

	public boolean onValmis() {
		return vaihe >= hirrenOsat.length;
	}

	public boolean piirraSeuraavaOsa() {
		if (onValmis())
			return true;

		ikkuna.add(hirrenOsat[vaihe]);
		vaihe++;
		if (!onValmis())
			return false;
		new Rotator(ikkuna, Axis.Y, 5, 100);
		return true;
	}

	public int vaiheitaJaljella() {
		return hirrenOsat.length - vaihe;
	}

	public static void main(String[] args) {
		Hirrenpiirto hirsi = new Hirrenpiirto(0);

		do {
			Syotto.kysy("Paina Enter");
		} while (!hirsi.piirraSeuraavaOsa());
	}

}
