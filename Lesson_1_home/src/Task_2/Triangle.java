package Task_2;

public class Triangle {

	private double a;
	private double b;
	private double c;

	private double p;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {

	}

	public double getArea() {

		p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}

	public double getA() {
		return a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	@Override
	public String toString() {
		return "Triangle [a = " + a + ", b = " + b + ", c = " + c + ", area = " + getArea() + "]";
	}

}
