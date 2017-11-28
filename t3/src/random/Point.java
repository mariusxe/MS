package random;

public class Point {

	private double x,y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point point) {
		double dx = this.x-point.x;
		double dy = this.y-point.y;
		return Math.sqrt(dx*dx+dy*dy);
	}

}
