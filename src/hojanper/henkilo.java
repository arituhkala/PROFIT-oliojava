package hojanper;

import java3esimerkit.Henkilo;

public class henkilo {

	private String Etunimi;
	private String Sukunimi;
	private int syntymavuosi;;

	public henkilo() {
		this(null, null, 0); // kutsutaan j�lkimm�ist� konstruktoria
	}

	public henkilo(String en, String sn, int s) {
		this.Etunimi = en;
		this.Sukunimi = sn;
		this.syntymavuosi = s;
	}

	public String getNimi() {
		String nimi;
		nimi = Etunimi + " " + Sukunimi;

		return nimi;
	}

	public int getSyntymavuosi() {
		return syntymavuosi;
	}

	public String toString() {
		return getNimi() + "|" + getSyntymavuosi();
	}

	public static void main(String[] args) {
		henkilo aku = new henkilo("Aku", "Ankka", 1934);
		System.out.println(aku.getNimi()); // tulostaa Aku Ankka
		System.out.println(aku.getSyntymavuosi()); // tulostaa 1934
		System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
	}
}
