package mpe;

import java.lang.Math;

public class Kokonaislukuja {

	public void kokonaisluvut() {
		for (int i = 0; i <= 1000; i++) {
			if (Math.sqrt(i) % 1 == 0) {
				System.out.println(i);
			}
		}
	}

}
