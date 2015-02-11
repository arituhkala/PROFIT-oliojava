package laitinenm;

public class Kokonaisluku {

	private static int arvo;

	// konstruktorit
	public Kokonaisluku() {
		this.arvo = 0;
	}

	public Kokonaisluku(int kokonaisluku) {
		this.arvo = kokonaisluku;
	}

	// saanti- ja asetusmetodit
	public static int getArvo() {
		return arvo;
	}

	public static void setArvo(int luku) {
		arvo = luku;
	}

	// lis��, v�henn�, kerro ja jaa metodit
	public static int lisaa(int luku) {
		setArvo(getArvo() + luku);
		return getArvo();
	}

	public static int vahenna(int luku) {
		setArvo(getArvo() - luku);
		return getArvo();
	}

	public static int kerro(int luku) {
		setArvo(getArvo() * luku);
		return getArvo();
	}

	public static double jaa(int luku) {
		setArvo(getArvo() / luku);
		return getArvo();
	}

}
