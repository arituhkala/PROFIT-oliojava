package juha;

public class juurakko {
	public void kokonaislukuJuuret() {
		int i = 1;
		int potenssi;
		while (i * i < 1000) {
			potenssi = i * i;
			System.out.println(Integer.toString(potenssi));
			i++;
		}
	}

	public static void main(String[] args) {
		juurakko j = new juurakko();
		j.kokonaislukuJuuret();

	}

}
