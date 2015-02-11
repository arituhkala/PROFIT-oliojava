package laitinenm;

public class Paivamaara {

	private int paiva;
	private int kuukausi;
	private int vuosi;

	public Paivamaara() {
		this.paiva = 0;
		this.kuukausi = 0;
		this.vuosi = 0;
	}

	public String toString(int pv, int kk, int v) {

		return pv + "|" + kk + "|" + v;
	}

	public void TulostaPaivamaara(int pv, int kk, int v) {

		System.out.println(toString(pv, kk, v));

	}

	public Paivamaara(int pv, int kk) {
		this.paiva = pv;
		this.kuukausi = kk;
	}

	public static int compareTo(Paivamaara pv1, Paivamaara pv2) {

		if (pv1.paiva == pv2.paiva && pv1.kuukausi == pv2.kuukausi)
			return 0;
		if (pv1.kuukausi > pv2.kuukausi
				|| (pv1.kuukausi == pv2.kuukausi && pv1.paiva > pv2.paiva))
			return 1;
		if (pv1.kuukausi < pv2.kuukausi
				|| (pv1.kuukausi == pv2.kuukausi && pv1.paiva < pv2.paiva))
			return -1;
		return 0xFF; // Error
	}

	public int compareTo(Paivamaara pv2) {

		if (paiva == pv2.paiva && kuukausi == pv2.kuukausi)
			return 0;
		if (kuukausi > pv2.kuukausi
				|| (kuukausi == pv2.kuukausi && paiva > pv2.paiva))
			return 1;
		if (kuukausi < pv2.kuukausi
				|| (kuukausi == pv2.kuukausi && paiva < pv2.paiva))
			return -1;
		return 0xFF; // Error
	}

	public static void main(String[] args) {
		// Tulostaa p�iv�m��r�n putkeen: 27|1|2015
		Paivamaara pvm = new Paivamaara();
		pvm.TulostaPaivamaara(27, 1, 2015);

		// K�ytt�esimerkki 2&3:een kun compareTo-metodit ovat Pvm-luokassa
		Paivamaara pv1 = new Paivamaara(1, 2), pv2 = new Paivamaara(3, 3);
		if (compareTo(pv1, pv2) < 0)
			System.out.println(pv1 + " < " + pv2);
		if (pv1.compareTo(pv2) != 0)
			System.out.println(pv1 + " != " + pv2);

	}

}