package ratkaisuja;

import java.util.ArrayList;
import java.util.List;

import nykanen4.Oppilas;
import sun.nio.cs.Surrogate.Generator;

/**
 * 
 * @author Nykanen modifications Ari
 * @date Feb 10, 2015
 */
public class Koulu {
	private final int koko = 50;
	private final String nimi = "Jokelanperän ala-aste";
	private Oppilas eka = null;
	private Oppilas vika = null;
	private List<Oppilas> oppilaat = new ArrayList<Oppilas>();

	public Koulu() {

	}

	/**
	 * @return the koko
	 */
	public int getKoko() {
		return koko;
	}

	public void uusiOppilas(String nimi, String sukupuoli) {
		Oppilas oppilas = new Oppilas(nimi, sukupuoli, vika);
		vika = oppilas;
		if (eka == null) {
			eka = oppilas;
		}
		oppilaat.add(oppilas);
	}

	public void poistaUusin() {
		Oppilas uusin = vika;
		Oppilas seuraava = uusin.seuraavaOn();
		oppilaat.remove(uusin);
		vika = seuraava;
	}

	public void listaaPojat() {
		System.out.println(nimi + "en pojat:");
		System.out.println("--------------");
		for (Oppilas oppilas : oppilaat) {
			if (oppilas.sukupuoliOn().equals("poika"))
				System.out.print(oppilas.nimiOn() + " | ");
		}
		System.out.println("\n--------------\n");
	}

	public void listaaTytot() {
		System.out.println(nimi + "en tytöt:");
		System.out.println("--------------");
		for (Oppilas oppilas : oppilaat) {
			// System.out.println(oppilas.nimiOn());
			if (oppilas.sukupuoliOn().equals("tytto"))
				System.out.print(oppilas.nimiOn() + " | ");
		}
		System.out.println("\n--------------\n");
	}

	public void listaaOppilaat() {
		System.out.println(nimi + "en oppilaat:");
		System.out.println("--------------");
		for (Oppilas oppilas : oppilaat) {
			System.out.print(oppilas.nimiOn() + " | ");
		}
		System.out.println("\n--------------\n");
	}

	public void tyhjennaKoulu() {
		for (Oppilas oppilas : oppilaat) {
			while (vika != null) {
				poistaUusin();
			}
		}

	}

	public void tyhjennaKoulu2() {
		System.out.println("Kurssi ohi! Saa poistua!");
		eka = null;
		vika = null;
		oppilaat.clear();
	}

	public static void main(String[] args) {
		Koulu koulu = new Koulu();
		koulu.uusiOppilas("erkki", "poika");
		koulu.uusiOppilas("petri", "poika");
		koulu.uusiOppilas("jaana", "tytto");
		koulu.uusiOppilas("tytti", "tytto");

		// Nasautetaan 50 satunnaista tytsyä ja poikaa
		RandomString merkkijono = new RandomString(10);
		for (int i = 0; i < koulu.getKoko() / 2; i++)
			koulu.uusiOppilas(merkkijono.nextString(), "tytto");
		for (int i = 0; i < koulu.getKoko() / 2; i++)
			koulu.uusiOppilas(merkkijono.nextString(), "poika");

		koulu.listaaTytot();
		koulu.listaaPojat();
		// koulu.tyhjennaKoulu();
		// koulu.listaaOppilaat();
		koulu.tyhjennaKoulu2();
		koulu.listaaOppilaat();

	}

}
