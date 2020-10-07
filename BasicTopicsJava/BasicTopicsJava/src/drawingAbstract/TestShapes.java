package drawingAbstract;

public class TestShapes {

	
	public static void main(String[] args) {
		Shapes[]s={new Circle(3.4f),new Rectangle(5.6f,2.2f),new Square(2.2f)};
		
		//for (int i = 0; i < s.length; i++) {
		//	s[i].calArea();
		//}
		
		for(Shapes sh: s) {
			sh.calArea();
		}
		
	}

}
