package timotammi;

import java.util.Vector;

public class Merkkijono2 {

	public Vector<String> parseString(String argString) {
		Vector<String> retVal = new Vector<String>();

		String[] splittedString = argString.split(" ");

		for (int i = 0; i < splittedString.length; i++) {
			retVal.add(splittedString[i]);
		}

		return retVal;
	}

	public static void main(String[] args) {
		Merkkijono2 merkkijono = new Merkkijono2();

		System.out.println(merkkijono.parseString(
				"Aasin silta alla auringon maan taivaan p��kallon").toString());
	}
}
