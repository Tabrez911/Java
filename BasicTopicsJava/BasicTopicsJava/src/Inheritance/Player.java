package Inheritance;

public class Player {
	int playId;
	String playName;
	String country;
	int numOfMatches;
	
	public Player() {
		playId=101;
		playName="Rohit";
		country="India";
		numOfMatches=120;
	}

	public Player(int playId, String playName, String country, int numOfMatches) {
		
		this.playId = playId;
		this.playName = playName;
		this.country = country;
		this.numOfMatches = numOfMatches;
	}

	public int getPlayId() {
		return playId;
	}

	public void setPlayId(int playId) {
		this.playId = playId;
	}

	public String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumOfMatches() {
		return numOfMatches;
	}

	public void setNumOfMatches(int numOfMatches) {
		this.numOfMatches = numOfMatches;
	}
	
	public void display() {
		System.out.println("Player Id: "+playId);
		System.out.println("Player name: "+playName);
		System.out.println("Player's country: "+country);
		System.out.println("No. of matches played: "+numOfMatches);
	}
	

}
