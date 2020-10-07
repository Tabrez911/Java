package Inheritance;

public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Batsman b1= new Batsman();
		b1.display();
		Batsman b2= new Batsman(101, "Virat","India",150,120);
		b2.display();
		
		Bowler bow1= new Bowler();
		bow1.display();
		Bowler bow2= new Bowler(123, "Johnson", "Australia", 459,981);
		bow2.display();

	}

}
