/**
 * 
 */
package matti_tammio;

/**
 * @author Matti
 *
 */

public class kokomaislukuja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double j;
		int k;
		for (int i = 0; i <= 1000; i++) {

			j = Math.sqrt(i);
			k = (int) j;
			if (k * k == i) {
				System.out.print(i);
				System.out.print(" ");
			}

		}
	}

}
