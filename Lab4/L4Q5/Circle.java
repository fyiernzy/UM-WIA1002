package Lab4.L4Q5;

public class Circle implements Comparable<Circle> {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public int compareTo(Circle another) {
		return (int) (this.radius - another.getRadius());
	}
	
	@Override
	public String toString() {
		return Double.toString(this.radius);
	}
}
