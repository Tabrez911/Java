package Inheritance;

public class Bowler extends Player {
	int noOfWickets;

	public Bowler() {
		super();
		noOfWickets=150;
	}

	public Bowler(int playId, String playName, String country, int numOfMatches,int noOfWickets) {
		super( playId,  playName,  country,  numOfMatches);
		this.noOfWickets = noOfWickets;
	}

	public int getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	
	public void display() {
		super.display();
		System.out.println("No of wickets: "+noOfWickets);
	}
	
	

}
