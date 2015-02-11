package timotammi;

public class Merkkijono {

	public String getEveryOtherChar(String argString) {
		StringBuilder resultString = new StringBuilder("");

		for (int i = 0; i < argString.length(); i = i + 2) {
			resultString.append(argString.substring(i, i + 1).toUpperCase());
		}

		return resultString.toString();
	}

	public static void main(String[] args) {
		Merkkijono merkkijono = new Merkkijono();
		System.out
				.println(merkkijono
						.getEveryOtherChar("Aasin silta alla auringon maan taivaan p��kallon"));
	}
}
