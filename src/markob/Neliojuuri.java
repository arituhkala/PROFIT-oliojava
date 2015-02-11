package markob;

public class Neliojuuri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			double j = Math.sqrt(i);
			if (j == (int) j) {
				System.out.println("neliojuuri on kokonaisluku luvulle " + i);
			}
		}
	}

}
