package laitinenm;

public class Kuvio {

	private double x;
	private double y;

	public Kuvio(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
		return;
	}

	public void setY(double y) {
		this.y = y;
		return;
	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
		return;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}
