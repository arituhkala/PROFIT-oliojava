package laitinenm;

/**
 * @author mikalait
 *
 */
public class Merkkijono {

	/**
	 * @param sourceString
	 * @return taulukko merkkijono
	 */
	public static String getModifiedString(String sourceString) {
		int len = sourceString.length();
		char[] charArray = new char[len];

		// put original string in an
		// array of chars
		for (int i = 0; i < len; i += 2) {
			charArray[i] = Character.toUpperCase(sourceString.charAt(i));
			charArray[i + 1] = Character
					.toLowerCase(sourceString.charAt(i + 1));
		}

		return new String(charArray);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String merkkijono = "Aasin silta alla auringon maan taivaan p��kallon";
		System.out.println(getModifiedString(merkkijono));
	}

}

/*
 * P�hkin�: Merkkijonojen k�sittelyn yhteydess� muistinkulutus voi kasvaa jos
 * aina merkkijono pit�� muuttaa character taulukoksi
 */
