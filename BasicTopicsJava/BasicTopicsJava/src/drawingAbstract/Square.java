package drawingAbstract;

public class Square extends Shapes {
	float side;
	double area;
	
	public Square(float side) {
		super();
		this.side = side;
	}
	public double calArea()

	{
		area=side*side;
		System.out.println("Area of square is: "+area);
		return area;
	}
}
