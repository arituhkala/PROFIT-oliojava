package mpe;

public class Fibonacci {

	public void tulostaFibonacciWhile(int pituus) {
		int i = 1, a = 0, b = 1, c = 0;
		System.out.print(b + " ");
		while (i < pituus) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			i++;
		}
		System.out.println();
	}

	public void tulostaFibonacciFor(int pituus) {
		int a = 0, b = 1, c = 0;
		System.out.print(b + " ");
		for (int i = 1; i < pituus; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		System.out.println();
	}

}
