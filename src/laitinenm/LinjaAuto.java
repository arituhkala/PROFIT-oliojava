package laitinenm;

public class LinjaAuto {

	private int paikat;
	private int vapaatpaikat;

	public LinjaAuto(int paikat, int vapaatpaikat) {
		this.paikat = paikat;
		this.vapaatpaikat = vapaatpaikat;
	}

	public int lisaaMatkustaja(int matkustajienLkm) {
		if (matkustajienLkm > vapaatpaikat) {
			return vapaatpaikat; // Error
		} else {
			vapaatpaikat -= matkustajienLkm;
			return 0; // OK
		}
	}

	public int vahennaMatkustaja(int matkustajienLkm) {
		if (vapaatpaikat + matkustajienLkm > paikat) {
			vapaatpaikat = paikat;
		} else {
			vapaatpaikat += matkustajienLkm;
		}
		return 0; // OK
	}

	public String toString() {

		return "Paikat: " + paikat + ", Vapaat paikat: " + vapaatpaikat;
	}

	public static void main(String[] args) {
		LinjaAuto sisu = new LinjaAuto(50, 50);
		sisu.lisaaMatkustaja(5);
		System.out.println(sisu.toString()); // tulostaa: Paikat: 50, Vapaat
												// paikat: 45

		sisu.vahennaMatkustaja(1);
		System.out.println(sisu.toString()); // tulostaa: Paikat: 50, Vapaat
												// paikat: 46
	}

}
