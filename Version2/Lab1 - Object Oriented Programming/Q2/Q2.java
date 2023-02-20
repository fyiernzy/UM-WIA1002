package Lab1.Q2;

public class Q2 {
	public static void main(String[] args) {
		Polynomial poly = new Polynomial(3, new double[] {4.0, 2.0, -0.5, -20.0});
		System.out.println("The polynomial is " + poly.toString());
		poly.calculate(2.0);
		poly.calculate(-3.5);
	}
}
