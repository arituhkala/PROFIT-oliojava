package ratkaisuja;

/**
 * Luokka, jossa harjoitellaan perusasioita.
 * 
 * @author Ari Tuhkala
 *
 */

public class PerusHarjoittelua {

	/**
	 * P��ohjelma, joka on koko luokan k�yt�ss�
	 * 
	 * @param args
	 *            ei k�yt�ss�
	 */
	public static void main(String[] args) {

		// Lukujen k�sittely�

		int lukuA = 9;
		double lukuB = 2.0;

		double vastaus = lukuA / lukuB;

		// Tulostetaan konsoliin vastaus
		System.out.println("lukuA / lukuB = " + vastaus);

		int lukuC = 9;
		int lukuD = 2;

		double vastaus2 = lukuC / lukuD;
		System.out.println("LukuC / lukuD = " + vastaus2);

		// Aritmeettiset operaatiot

		int lukuE = 0;

		lukuE++; // Kasvattaa lukua yhdell�
		System.out.println("LukuE arvo lis�ysoperaation j�lkeen = " + lukuE);

		lukuE--;
		System.out.println("LukuE arvo v�hennysoperaation j�lkeen = " + lukuE);

		lukuE = 0; // nollataan lukuE

		// Summa
		lukuE = lukuE + 10;

		// Summaoperaatio
		lukuE += 10;

		System.out.println("LukuE pit�isi t�ss� vaiheessa olla 20 == " + lukuE);

		// Ehtolauseet ja toistorakenteet

		int kierros = 0;

		while (kierros < 10) {

			System.out.println("While-silmukan kierros: " + kierros);
			kierros++;
		}

		do {
			System.out.println("Do-while kierros: " + kierros);
			kierros++;
		} while (kierros < 20);

		for (int i = 20; i <= 30; i++) {
			System.out.println("For kierros: " + i);
		}

		// Vertailuoperaattorit ja loogiset operaatiot

	}

}
