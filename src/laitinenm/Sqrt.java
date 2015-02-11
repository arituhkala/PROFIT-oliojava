package laitinenm;

/**
 * @author mikalait
 *
 */
public class Sqrt {

	/**
	 * @param root
	 */
	public static void printIfZeroModSqrt(double root) {
		if ((Math.sqrt(root) * 10) % 10 == 0) {
			System.out.println((int) root);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// tehtavat1.md, L�mmittelyt, Kokonaislukuja
		double root;
		System.out.println("The following sqrts have no remainder:");
		for (root = 0; root <= 1000; root++) {
			printIfZeroModSqrt(root);
		}

	}

}
