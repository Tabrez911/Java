package Interface;

import Inheritance.Player;

public class Batsman extends Player implements Taxable{
	int noOfRuns;
	
	public Batsman() {
		super();
		noOfRuns=2500;
	}

	public Batsman(int playId, String playName, String country, int numOfMatches,int noOfRuns) {
		super( playId,  playName,  country,  numOfMatches);
		this.noOfRuns = noOfRuns;
	}

	public int getNoOfRuns() {
		return noOfRuns;
	}

	public void setNoOfRuns(int noOfRuns) {
		this.noOfRuns = noOfRuns;
	}
	
	public void display() {
		super.display();
		System.out.println("No. of runs: "+noOfRuns);
	}

	@Override
	public void calTax() {
		// TODO Auto-generated method stub
		System.out.println("Batsman's tax Calculated");
	}
	
	

}
