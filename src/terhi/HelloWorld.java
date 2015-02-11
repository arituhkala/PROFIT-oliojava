package terhi;

/**
 * 
 * @author Terhi J�rvenp��
 *
 */
public class HelloWorld {
	/**
	 * 
	 * @param nimi
	 * 
	 * 
	 */

	private static String pieniNimi;
	private static String isoNimi;

	public void yellToWorld(String nimi) {

		System.out.println("Hello world it's " + nimi + " here");

	}

	/**
	 * @param nimi
	 *            annettava nimi
	 * @return nimi isolla kirjoitettuna
	 */
	private static String muutaIsoksi(String pieniNimi) {

		isoNimi = pieniNimi.toUpperCase();
		// System.out.println(isoNimi);
		return isoNimi;
	}

	public static void main(String[] args) {
		/**
		 * main
		 */
		HelloWorld terhi = new HelloWorld();

		terhi.yellToWorld("Terhi");

		// Muutetaan nimi isoiksi kirjaimiksi
		HelloWorld terttu = new HelloWorld();
		terttu.muutaIsoksi("Terttu");
		terttu.yellToWorld(isoNimi);

	}

}
