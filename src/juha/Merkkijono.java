package juha;

public class Merkkijono {
	String isonnaJokaToinen(String sisaan) {
		String ulos = new String();
		int pituus = sisaan.length();
		for (int i = 0; i < pituus; i++) {
			if ((i + 1) % 2 == 0)
				ulos += sisaan.charAt(i);
		}

		ulos = ulos.toUpperCase();
		return ulos;
	}

	public static void main(String[] args) {
		String aasiAluksi = "Aasinsilta alla auringon maan taivaan p��kallon";
		Merkkijono isotMerkit = new Merkkijono();
		System.out.println(isotMerkit.isonnaJokaToinen(aasiAluksi));

	}

}
