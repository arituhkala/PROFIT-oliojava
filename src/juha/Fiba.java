package juha;

//tulostaa 0, 1 ja sen j�lkeen annetun m��r�n
public class Fiba {
	public void fibaWhilella(int maara) {
		int luku1 = 0, luku2 = 1, luku3, tulostettu = 0;
		System.out.println(luku1);
		System.out.println(luku2);
		while (tulostettu < maara) {
			luku3 = luku1 + luku2;
			System.out.println(luku3);
			luku1 = luku2;
			luku2 = luku3;
			tulostettu++;
		}
	}

	public void fibaForilla(int maara) {
		int luku1 = 0, luku2 = 1, luku3;
		System.out.println(luku1);
		System.out.println(luku2);
		for (int i = 0; i < maara; i++) {
			luku3 = luku1 + luku2;
			System.out.println(luku3);
			luku1 = luku2;
			luku2 = luku3;
		}
	}

	public static void main(String[] args) {
		Fiba fiba = new Fiba();
		fiba.fibaWhilella(20);
		// fiba.fibaForilla(20);
	}

}
