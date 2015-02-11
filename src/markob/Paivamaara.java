package markob;

public class Paivamaara {

	public int paiva, kuukausi, vuosi;

	public Paivamaara(int d, int m, int y) {
		paiva = d;
		kuukausi = m;
		vuosi = y;
	}

	public String toString() {
		return "" + paiva + "-" + kuukausi + "-" + vuosi;
	}

	public static int compareTo(Paivamaara eka, Paivamaara toka) {
		if (eka.vuosi < toka.vuosi) {
			return -1;
		}
		if (eka.vuosi > toka.vuosi) {
			return 1;
		}
		if (eka.kuukausi < toka.kuukausi) {
			return -1;
		}
		if (eka.kuukausi > toka.kuukausi) {
			return 1;
		}
		if (eka.paiva < toka.paiva) {
			return -1;
		}
		if (eka.paiva > toka.paiva) {
			return 1;
		}
		return 0;
	}

	public int compareTo(Paivamaara toka) {
		return compareTo(this, toka);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paivamaara paiva1 = new Paivamaara(11, 10, 1970);
		Paivamaara paiva2 = new Paivamaara(11, 10, 1970);
		System.out.println("Paivamaara on " + paiva1.toString());
		System.out.println("Paivamaara on " + paiva2.toString());
		if (compareTo(paiva1, paiva2) < 0)
			System.out.println(paiva1 + " < " + paiva2);
		if (paiva1.compareTo(paiva2) > 0)
			System.out.println(paiva1 + " > " + paiva2);
		if (paiva1.compareTo(paiva2) == 0)
			System.out.println(paiva1 + " = " + paiva2);
	}

}
