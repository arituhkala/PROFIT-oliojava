package mpe;

public class Henkilo {
	private String etunimi;
	private String sukunimi;
	private int syntymavuosi;

	public Henkilo(String etunimi, String sukunimi, int syntymavuosi) {
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.syntymavuosi = syntymavuosi;
	}

	public String getEtunimi() {
		return this.etunimi;
	}

	public String getSukunimi() {
		return this.sukunimi;
	}

	public int getSyntymavuosi() {
		return this.syntymavuosi;
	}

	public String getNimi() {
		return this.getEtunimi() + " " + this.getSukunimi();
	}

	public String toString() {
		return this.getEtunimi() + "|" + this.getSukunimi() + "|"
				+ this.getSyntymavuosi();
	}
}
