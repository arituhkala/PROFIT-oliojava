package laitinenm;

import java3esimerkit.Lukija;

import laitinenm.Kokonaisluku;
import java3esimerkit.Lukija;

public class LukuTesti {

	// p��ohjelma
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luku = 0;
		int toiminto = 9;
		Kokonaisluku z = new Kokonaisluku();

		while (toiminto != 0) {
			System.out.println("Anna luku: \n");
			luku = Lukija.lueInt();
			System.out
					.println("Anna toiminto: 1 = Lis��, 2 = V�henn�, 3 = Kerro, 4 = Jaa, 0 = Lopeta\n");
			toiminto = Lukija.lueInt();

			switch (toiminto) {
			case 1:
				System.out.println("Kokonaisluvun lis�tty arvo: "
						+ z.lisaa(luku)); // Lis�� vakion ja tulostaa arvon
				break;
			case 2:
				System.out.println("Kokonaisluvun v�hennetty arvo: "
						+ z.vahenna(luku)); // V�hent�� vakion ja tulostaa arvon
				break;
			case 3:
				System.out.println("Kokonaisluvun kerrottu arvo: "
						+ z.kerro(luku)); // Kertoo vakion ja tulostaa arvon
				break;
			case 4:
				System.out.println("Kokonaisluvun jaettu arvo: " + z.jaa(luku)); // Jakaa
																					// vakion
																					// ja
																					// tulostaa
																					// arvon
				break;
			case 0:
				System.out.println("Bye, bye!"); // Lopetetaan
				break;
			default:
				System.out.println("Ei tuettu toiminto"); // Jakaa vakion ja
															// tulostaa arvon

			}
		}

	}

}
