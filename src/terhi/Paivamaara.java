package terhi;

/**
 * 
 * @author Terhi J�rvenp��
 *
 */

public class Paivamaara {

	/** P�iv� */
	private int paiva;

	/** Kuukausi */
	private int kuukausi;

	/** vuosi */
	private int vuosi;

	/**
	 * Konstruktori = Muodostaja
	 * 
	 * @param p
	 * @param kk
	 * @param v
	 */
	public Paivamaara(int p, int kk, int v) {
		paiva = p;
		kuukausi = kk;
		vuosi = v;
	}

	/**
	 * lisaa . merkin
	 * 
	 * @param pvm
	 * @return kokoPvm
	 */
	public String toString(Paivamaara pvm) {
		String kokoPvm;
		kokoPvm = pvm.paiva + "." + pvm.kuukausi + "." + pvm.vuosi;
		return kokoPvm;

	}

	/**
	 * verrataan oliota itse��n ja p�iv�m��r�� pv2
	 * 
	 * @param pv1
	 * @param pv2
	 * @return -1,0 tai 1
	 */
	public static int compareTo(Paivamaara pv1, Paivamaara pv2) {
		int i = 0;
		if (pv1.vuosi <= pv2.vuosi) {
			if (pv1.kuukausi <= pv2.kuukausi) {
				if (pv1.paiva < pv2.paiva)
					return -1;
			} else
				i = 1;
		} else
			i = 1;
		return i;

	}

	/**
	 * main testausta varten
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Paivamaara pvm1 = new Paivamaara(3, 2, 2015);
		System.out.println(pvm1.toString(pvm1)); // tulostaa p�iv�m��r�n

		Paivamaara pvm2 = new Paivamaara(12, 2, 2015);
		if (compareTo(pvm1, pvm2) < 0)
			System.out.println(pvm1.toString(pvm1) + " < "
					+ pvm2.toString(pvm2));
		if (compareTo(pvm1, pvm2) == 0)
			System.out.println(pvm1.toString(pvm1) + " = "
					+ pvm2.toString(pvm2));
		if (compareTo(pvm1, pvm2) > 0)
			System.out.println(pvm1.toString(pvm1) + " > "
					+ pvm2.toString(pvm2));

	}

}
