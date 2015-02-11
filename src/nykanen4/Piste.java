package nykanen4;

/**
 * Piste-luokka avustamaan lumiukon piirtämisen paikkaa
 * 
 * @author Nykänen (comments Ari)
 * @date Feb 10, 2015
 */
public class Piste {

	// Attribuutit: x-koordinaatti ja y-koordinaatti
	private double x;
	private double y;

	/**
	 * Konstruktori pisteelle
	 * 
	 * @param x
	 *            alustattava x-koordinaatti
	 * @param y
	 *            alustettava y-koordinaatti
	 */
	public Piste(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Saantimetodi x-koordinaatille
	 * 
	 * @return x-koordinaatti
	 */
	public double getX() {
		return x;
	}

	/**
	 * Saantimetodi y-koordinaatille
	 * 
	 * @return y-koordinaatti
	 */
	public double getY() {
		return y;
	}

	/**
	 * Asetusmetodi x-koordinaatille
	 * 
	 * @param newX
	 *            uusi x-koordinaatti
	 */
	public void setX(double newX) {
		x = newX;
	}

	/**
	 * Asetusmetodi y-koordinaatille
	 * 
	 * @param newY
	 *            y-koordinaatti
	 */
	public void setY(double newY) {
		y = newY;
	}

	/**
	 * Siirtää pisteen y-koordinaattia
	 * 
	 * @param movement
	 *            siirrettävä määrä
	 */
	public void moveY(double movement) {
		y += movement;
	}
}
