package drawingAbstract;

public class Circle extends Shapes{
	float r;
	double area;

	public Circle(float r) {
		super();
		this.r = r;
	}
public	double calArea() {
	
	area=2*3.14f*r;
	System.out.println("Area of circle is: "+area);
	return area;
	
}
	

}
