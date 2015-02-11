package tani;

public class kokonaislukuja {

	public static void main(String[] args) {
		double a;
		for (int i = 1; i <= 1000; ++i) {
			a = Math.sqrt(i);
			if (a % 1 == 0)
				System.out.println(i);
		}
	}
}
