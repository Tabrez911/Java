package drawingAbstract;

public class Rectangle extends Shapes {
	float l,b;
	double area;
	
	public Rectangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}
	public	double calArea()
	{
		area=l*b;
		System.out.println("Area of rectangle is: "+area);
		return area;
	}
	

}
