package laitinenm;

public class Henkilo {
	private String etunimi;
	private String sukunimi;
	private int syntymavuosi;

	public Henkilo(String etunimi, String sukunimi, int syntymavuosi) {
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.syntymavuosi = syntymavuosi;
	}

	public String getNimi() {
		return etunimi + " " + sukunimi;
	}

	public int getSyntymavuosi() {
		return syntymavuosi;
	}

	public String toString() {
		return etunimi + "|" + sukunimi + "|" + syntymavuosi;
	}

	public static void main(String[] args) {
		Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
		System.out.println(aku.getNimi()); // tulostaa Aku Ankka
		System.out.println(aku.getSyntymavuosi()); // tulostaa 1934
		System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
	}

}
