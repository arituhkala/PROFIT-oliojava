package timotammi;

public class IntegerCalculus {

	public void PrintSquareRoots() {
		for (int i = 0; i < 1000; i++) {

			long test = (long) (Math.sqrt(i) + 0.5);

			if (test * test == i) {
				System.out.println(i);
			}

		}
	}

	public static void main(String args[]) {
		IntegerCalculus ic = new IntegerCalculus();
		ic.PrintSquareRoots();

	}
}
