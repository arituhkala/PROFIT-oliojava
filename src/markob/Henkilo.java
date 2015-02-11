package markob;

public class Henkilo {

	public String etunimi, sukunimi;
	public int syntymavuosi;

	public Henkilo(String etu, String suku, int synt) {
		etunimi = etu;
		sukunimi = suku;
		syntymavuosi = synt;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public String getNimi() {
		return "" + getEtunimi() + " " + getSukunimi();
	}

	public int getSyntymavuosi() {
		return syntymavuosi;
	}

	public String toString() {
		return getEtunimi() + "|" + getSukunimi() + "|" + getSyntymavuosi();
	}

	public static void main(String[] args) {
		Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
		System.out.println(aku.getNimi()); // tulostaa Aku Ankka
		System.out.println(aku.getSyntymavuosi()); // tulostaa 1934
		System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
	}

}
