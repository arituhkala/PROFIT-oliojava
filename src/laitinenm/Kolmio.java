package laitinenm;

import fi.jyu.mit.graphics.*;

public class Kolmio extends Kuvio {

	private int sivunPituus;

	public Kolmio(double x, double y, int l) {
		super(x, y);
		sivunPituus = l;
	}

	public int getSivunPituus() {
		return sivunPituus;
	}

	public void piirraKolmio(EasyWindow w, Kuvio kuvio, int len) {
		w.addLine(kuvio.getX(), kuvio.getY(), kuvio.getX() + len, kuvio.getY());
		kuvio.setX(kuvio.getX() + len);

		w.addLine(kuvio.getX(), kuvio.getY(), kuvio.getX() - len / 2,
				kuvio.getY() + len / 2);
		kuvio.setXY(kuvio.getX() - len / 2, kuvio.getY() + len / 2);

		w.addLine(kuvio.getX(), kuvio.getY(), kuvio.getX() - len / 2,
				kuvio.getY() - len / 2);
	}

	public static void main(String[] args) {
		// Luodaan uusi ikkuna
		EasyWindow window = new EasyWindow();
		window.scale(0, 0, 1000, 1000);

		Kuvio kuvio = new Kuvio(100, 100);
		Kolmio kolmio = new Kolmio(kuvio.getX(), kuvio.getY(), 30);

		kolmio.piirraKolmio(window, kuvio, 200);

		kuvio.setXY(300, 100);
		kolmio.piirraKolmio(window, kuvio, 200);

		kuvio.setXY(200, 200);
		kolmio.piirraKolmio(window, kuvio, 200);

		// N�ytet��n ikkuna
		window.showWindow();
	}

}
