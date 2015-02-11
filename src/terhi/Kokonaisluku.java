package terhi;

/**
 * 
 * @author Terhi J�rvenp��
 * 
 */

public class Kokonaisluku {
	private int arvo;

	/**
	 * Konstruktori
	 * 
	 */
	public Kokonaisluku() {
		arvo = 0;
	}

	/**
	 * Konstruktori
	 * 
	 * @param i
	 */
	public Kokonaisluku(int i) {
		arvo = i;
	}

	/**
	 * palauttaa arvon
	 * 
	 * @return arvo
	 */
	public int getArvo() {
		return arvo;
	}

	/**
	 * lis�� i:n arvoon
	 * 
	 * @param i
	 */
	public void lisaa(int i) {
		arvo = arvo + i;
	}

	/**
	 * v�hent�� i:n arvoon
	 * 
	 * @param i
	 */
	public void vahenna(int i) {
		arvo = arvo - i;
	}

	/**
	 * kertoo arvon i:ll�
	 * 
	 * @param i
	 */
	public void kerro(int i) {
		arvo = arvo * i;
	}

	/**
	 * jakaa arvon i:ll�
	 * 
	 * @param i
	 */
	public void jaa(int i) {
		arvo = arvo / i;
	}

	/**
	 * tulostaa l:n arvon
	 * 
	 * @param l
	 */

	public void tulosta(Kokonaisluku l) {
		System.out.println(l.getArvo());
	}

	/**
	 * main testausta varten
	 * 
	 * @param args
	 * 
	 */
	/*
	 * public static void main(String[] args) { Kokonaisluku luku1 = new
	 * Kokonaisluku(1); //tulostaa arvon luku1.tulosta(luku1); //lis�� arvoa
	 * luku1.lisaa(2); //tulostaa arvon luku1.tulosta(luku1); //v�hent�� arvoa
	 * luku1.vahenna(2); //tulostaa arvon luku1.tulosta(luku1); //kertolasku
	 * luku1.kerro(5); //tulostaa arvon luku1.tulosta(luku1); //jakolasku
	 * luku1.jaa(5); //tulostaa arvon luku1.tulosta(luku1);
	 * 
	 * }
	 */

}