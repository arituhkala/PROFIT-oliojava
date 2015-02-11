package markob;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lukumaara = 11;
		fibonacciwhile(lukumaara);
		System.out.print("\n");
		fibonaccifor(lukumaara);
		System.out.print("\n");
		for (int i = 0; i < lukumaara; ++i)
			System.out.print(fibonaccirekursio(i) + " ");
	}

	public static void fibonacciwhile(int loop) {
		int vanhaArvo = 1, edellinenVanhaArvo = 0, n = 0;
		do {
			int nykyArvo = edellinenVanhaArvo;
			edellinenVanhaArvo = vanhaArvo;
			vanhaArvo = nykyArvo + edellinenVanhaArvo;
			System.out.print(nykyArvo + " ");
			n++;
		} while (n < loop);

	}

	public static void fibonaccifor(int loop) {
		int edellinenVanhaArvo = 0, vanhaArvo = 1;
		for (int n = 0; n < loop; n++) {
			int nykyArvo = edellinenVanhaArvo;
			edellinenVanhaArvo = vanhaArvo;
			vanhaArvo = nykyArvo + edellinenVanhaArvo;
			System.out.print(nykyArvo + " ");
		}
	}

	public static int fibonaccirekursio(int arvo) {
		if (arvo == 0)
			return 0;
		else if (arvo < 3)
			return 1;
		else
			return fibonaccirekursio(arvo - 1) + fibonaccirekursio(arvo - 2);
	}

}