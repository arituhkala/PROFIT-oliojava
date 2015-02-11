package terhi;

/**
 * Perusharjoituksia laskimen avulla
 * 
 * @author Terhi J�rvenp��
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
	 * @param c
	 *            kolmas luku
	 * @return lukujen summa
	 */
	public int summaa(int a, int b, int c) {
		return a + b + c;
	}

	/**
	 * Nollaa taulukon alkiot ja tulostaa nollatun taulukon
	 * 
	 * @param taulu
	 *            taulukko, jonka alkiot nollataan
	 */
	public void nollaaTaulu(int[] taulu) {

		for (int i = 0; i < taulu.length; i++)
			taulu[i] = 0;

		for (int j = 0; j < taulu.length; j++)
			System.out.println(taulu[j]);
	}

	/**
	 * Hakee taulukon pienimm�n alkion ja tulosta sen
	 * 
	 * @param taulu
	 */
	public void taulukonPienin(int[] taulu) {
		int apu2 = taulu[0];

		for (int i = 0; i < taulu.length; i++) {
			int apu = taulu[i];
			if (apu < apu2)
				apu2 = taulu[i];
		}

		System.out.println("Taulukon pienin " + apu2);
	}

	/**
	 * P��ohjelma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Laskin laskin = new Laskin();

		System.out.println(laskin.summaa(3, 2, 1));

		int[] tauluA = { 1, 2, 3, 4, 5, 6, 7 };

		for (int j = 0; j < tauluA.length; j++)
			System.out.println(tauluA[j]);

		laskin.nollaaTaulu(tauluA);

		int[] tauluB = { 4, 6, 1, 2 };
		laskin.taulukonPienin(tauluB);

	}

}
