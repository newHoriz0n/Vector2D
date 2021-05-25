package math;

public class Vektor2D {

	private double x;
	private double y;

	public Vektor2D() {
		this.x = 0;
		this.y = 0;
	}

	public Vektor2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vektor2D(Vektor2D v) {
		this.x = v.x;
		this.y = v.y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vektor2D scale(double d) {
		this.x *= d;
		this.y *= d;
		return this;
	}

	public void add(Vektor2D a) {
		this.x += a.x;
		this.y += a.y;
	}

	public Vektor2D subtract(Vektor2D a) {
		this.x -= a.x;
		this.y -= a.y;
		return this;
	}

	public double calcLength() {
		return Math.sqrt(x * x + y * y);
	}

	public Vektor2D norm() {
		double l = calcLength();
		this.x = x / l;
		this.y = y / l;
		return this;
	}

	@Override
	public String toString() {
		return x + ", " + y; 
	}
	
}
