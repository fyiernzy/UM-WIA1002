package Lab1.Q2;

public class Polynomial {
	int degree;
	double[] arr;
	
	Polynomial(int degree, double[] arr) {
		this.degree = degree;
		this.arr = arr;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int deg = degree;
		for(double coefficient : arr) {
			sb.append(String.format("%s%s%s%s ", 
					coefficient > 0 ? "+" : "", coefficient, deg > 0 ? "x" : "", deg > 1 ? "^" + deg : ""));
			deg--;
		}
		
		return sb.toString().substring(1);
	}
	
	public void calculate(double x) {
		System.out.println("when x = " + x);
		System.out.println(toString() + "= " + count(x));
	}
	
	private double count(double x) {
		double sum = 0;
		int deg = degree;
		
		for(double coefficient : arr) {
			sum += coefficient * Math.pow(x, deg--);
		}
		
		return sum;
	}
	
}
