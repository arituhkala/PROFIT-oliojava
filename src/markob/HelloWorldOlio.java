package markob;

public class HelloWorldOlio {

	public void yellToWorld(String nimi) {
		System.out.println("Hello there " + nimi);
	}

	/**
	 * Metodi muuttaa parametrina sy�tetyn nimen isoiksi kirjaimiksi
	 * 
	 * @param nimi
	 *            annettava nimi
	 * @return nimi isolla kirjoitettuna
	 */

	public String muutaIsoksi(String pikkuNimi) {
		String isoNimi = pikkuNimi.toUpperCase();
		return isoNimi;
	}

	/**
	 * P��ohjelma, jossa k�ynnistet��n ohjelma
	 * 
	 * @param args
	 *            ei k�yt�ss�
	 */

	public static void main(String[] args) {

		// Luodaan HelloWorld olio
		HelloWorldOlio olio = new HelloWorldOlio();
		HelloWorldOlio olio2 = new HelloWorldOlio();

		// Kutsutaan olion yellToWorld metodia
		olio.yellToWorld("Arska");

		// Muutetaan nimi isoiksi kirjaimiksi
		String isoNimi = olio2.muutaIsoksi("Ville");
		olio2.yellToWorld(isoNimi);
	}
}
