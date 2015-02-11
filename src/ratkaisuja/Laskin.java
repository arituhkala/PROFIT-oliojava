package ratkaisuja;

/**
 * Perusharjoituksia laskimen avulla
 * 
 * @author Ari Tuhkala
 *
 */
public class Laskin {

	/**
	 * Summaa kaksi lukua
	 * 
	 * @param a
	 *            ensimm�inen luku
	 * @param b
	 *            toinen luku
	 * @return lukujen summa
	 */
	public int summaa(int a, int b) {
		return a + b;
	}

	/**
	 * Nollaa taulukon alkiot
	 * 
	 * Indeksi: 0 1 2 Taulu: 4 6 8
	 * 
	 * Nollauksen j�lkeen Indeksi: 0 1 2 Taulu: 0 0 0
	 * 
	 * @param taulu
	 *            taulukko, jonka alkiot nollataan
	 */
	public void nollaaTaulu(int[] taulu) {
		int i = 0;
		while (i < taulu.length) {
			taulu[i] = 0;
			i++;
		}
	}

	/**
	 * P��ohjelma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Laskin laskin = new Laskin();

		// summaa metodi
		int summa = laskin.summaa(4, 6);
		System.out.println(summa);

		// Tyhj� taulu, jossa on 5 indeksi�
		int[] tyhjaTaulu = new int[5];

		// Taulukon k�sittely

		int taulu[] = { 4, 6 };
		System.out.println(laskin.summaa(taulu[0], taulu[1]));

		// Mit� tarkoittaa k�yt�nn�ss�, ett� taulukko on olioviite
		laskin.nollaaTaulu(taulu);
		System.out.println("Nollauksen j�lkeen:\nIndeksiss� 0: " + taulu[0]
				+ "\nIndeksiss� 1: " + taulu[1]);

	}

}
