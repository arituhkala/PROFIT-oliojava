package markob;

public class Merkkijono {

	public static String jokatoinen(String merkkijono) {
		StringBuffer jokatoinen = new StringBuffer("");
		for (int i = 0; i < merkkijono.length(); i++) {
			Character c = merkkijono.charAt(i);
			if (i % 2 == 0)
				jokatoinen.append(c);
			else
				jokatoinen.append(Character.toUpperCase(c));
		}
		return jokatoinen.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aasiMerkkijono = "Aasin silta alla auringon maan taivaan p��kallon";
		String tulosMerkkijono = jokatoinen(aasiMerkkijono);
		System.out.println("Tulosmerkkijono " + tulosMerkkijono);
	}

}
