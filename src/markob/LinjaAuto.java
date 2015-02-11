package markob;

public class LinjaAuto {

	private final int paikkamaara = 30;

	public int matkustajia, vapaita;

	public LinjaAuto() {
		matkustajia = 0;
		vapaita = paikkamaara;
	}

	public void lisaaMatkustaja() {
		matkustajia++;
		System.out.println("matkustaja lisatty");
		vapaita = paikkamaara - matkustajia;
	}

	public void poistaMatkustaja() {
		if (matkustajia == 0) {
			matkustajia = 0;
			System.out.println("auto on jo tyhja");
		} else {
			matkustajia--;
			System.out.println("matkustaja poistettu");
		}
		vapaita = paikkamaara - matkustajia;
	}

	public int getMatkustajamaara() {
		return matkustajia;
	}

	public int getVapaitamaara() {
		return vapaita;
	}

	public static void main(String[] args) {
		LinjaAuto linkki = new LinjaAuto();

		System.out.println("matkustajia: " + linkki.getMatkustajamaara());
		System.out.println("vapaita: " + linkki.getVapaitamaara());
		linkki.lisaaMatkustaja();
		System.out.println("matkustajia: " + linkki.getMatkustajamaara());
		System.out.println("vapaita: " + linkki.getVapaitamaara());
		linkki.lisaaMatkustaja();
		System.out.println("matkustajia: " + linkki.getMatkustajamaara());
		System.out.println("vapaita: " + linkki.getVapaitamaara());
		linkki.poistaMatkustaja();
		System.out.println("matkustajia: " + linkki.getMatkustajamaara());
		System.out.println("vapaita: " + linkki.getVapaitamaara());
		linkki.poistaMatkustaja();
		System.out.println("matkustajia: " + linkki.getMatkustajamaara());
		System.out.println("vapaita: " + linkki.getVapaitamaara());
		linkki.poistaMatkustaja();
		System.out.println("matkustajia: " + linkki.getMatkustajamaara());
		System.out.println("vapaita: " + linkki.getVapaitamaara());
	}

}
