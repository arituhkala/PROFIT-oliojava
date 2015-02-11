package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 1.2.2015
 *
 */

public class LinjaAuto {
	private int kapasiteettiVirhe;
	private final int istuimienLukumaara;
	private int vapaidenIstuimienLukumaara;

	/**
	 * Oletusmuodostin.
	 */

	public LinjaAuto() {
		kapasiteettiVirhe = 0;
		istuimienLukumaara = 60;
		vapaidenIstuimienLukumaara = istuimienLukumaara;
	}

	/**
	 * Matkustajien laskeminen pois linja-autosta.
	 * 
	 * @param matkustajienLukumaara
	 *            Autosta poistuvien matkustajien lukum��r�.
	 */

	public void vahenna(int matkustajienLukumaara) {
		int tyhjiaIstuimia = vapaidenIstuimienLukumaara + matkustajienLukumaara;

		if (tyhjiaIstuimia <= istuimienLukumaara) {
			// Henkil�it� poistunut autosta. Tyhji� istuimia on lis��.
			vapaidenIstuimienLukumaara = tyhjiaIstuimia;
		} else {
			// T�ysin mahdoton tapahtuma. Henkil�it� on poistunut enemm�n
			// kuin autoon on kyytiin otettu.
			vapaidenIstuimienLukumaara = istuimienLukumaara;
		}

		kapasiteettiVirhe = 0;
	}

	/**
	 * Uusien matkustajien kyytiin otto.
	 * 
	 * @param matkustajienLukumaara
	 *            Autoon nousevien matkustajien lukum��r�.
	 * @return Nolla jos matkustajat mahtuivat autoon. Miinusarvo kertoo
	 *         pys�kille j�tettyjen matkustajien lukum��r�n.
	 * 
	 */

	public int lisaa(int matkustajienLukumaara) {
		int tyhjiaIstuimia = vapaidenIstuimienLukumaara - matkustajienLukumaara;

		if (vapaidenIstuimienLukumaara - matkustajienLukumaara >= 0) {
			// Lis�� matkustajia on otettu kyytiin. Tyhji� istuimia on v�hemm�n.
			kapasiteettiVirhe = 0;
			vapaidenIstuimienLukumaara = tyhjiaIstuimia;
		} else {
			// Linja-auto on tullut t�yteen. Yht��n tyhj�� istuinta ei ole en��
			// vapaana. Osa kyytiin pyrkij�ist� jouduttiin j�tt�m��n pys�kille.
			vapaidenIstuimienLukumaara = 0;
			kapasiteettiVirhe = tyhjiaIstuimia;
		}

		return tyhjiaIstuimia;
	}

	/**
	 * Palauttaa maksimi henkil�m��r�n jonka linja-auto voi kuljettaa.
	 * 
	 * @return Linja-auton maksimi kuljetuskapasitetti, henkil�m��r�ll�
	 *         mitattuna.
	 */

	public int getIstuimienLukumaara() {
		return istuimienLukumaara;
	}

	/**
	 * Palauttaa henkil�m��r�n joka mahtuu viel� linja-autoon.
	 * 
	 * @return Henkil�m��r� jonka linja-auto voi viel� ottaa kyytiin.
	 */

	public int getVapaidenIstuimienLukumaara() {
		return vapaidenIstuimienLukumaara;
	}

	/**
	 * Tulostaa t�rkeimm�t tiedot.
	 */

	public void tulosta() {
		int istuimia = getIstuimienLukumaara();
		int vapaana = getVapaidenIstuimienLukumaara();

		System.out.println("Paikkatilanne: "
				+ vapaana
				+ " vapaana / "
				+ (istuimia - vapaana)
				+ " varattuna"
				+ (kapasiteettiVirhe < 0 ? " / Pys�kille piti j�tt�� "
						+ -kapasiteettiVirhe : ""));
	}

	/**
	 * P��ohjelma.
	 * 
	 * @param args
	 *            Ei k�yt�ss�.
	 */

	public static void main(String[] args) {
		LinjaAuto auto = new LinjaAuto();
		auto.tulosta();

		auto.lisaa(3);
		auto.tulosta();

		auto.lisaa(1);
		auto.tulosta();

		auto.lisaa(8);
		auto.tulosta();

		auto.lisaa(55);
		auto.tulosta();

		auto.vahenna(3);
		auto.tulosta();

		auto.vahenna(6);
		auto.tulosta();

		auto.vahenna(20);
		auto.tulosta();

		auto.vahenna(30);
		auto.tulosta();

		auto.vahenna(2);
		auto.tulosta();
	}
}
