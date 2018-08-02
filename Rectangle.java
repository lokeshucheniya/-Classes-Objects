public class Rectangle {
	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length > 0.0)
			this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		if(breadth > 0.0) 
			this.breadth = breadth;
	}
	public double area()
	{
		double area = length * breadth;
		return area;
	}
	public double circumference()
	{
		double circumference = 2 * (length + breadth);
		return circumference;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", area()=" + area() + ", circumference()="
				+ circumference() + "]";
	}
}