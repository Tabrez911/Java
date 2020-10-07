
public class MyDate {

	int dd;
	int mm;
	int yy;

	public MyDate() {
		dd = 23;
		mm = 9;
		yy = 2020;
	}

	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	public void display() {
		System.out.println(dd + "/" + mm + "/" + yy);
	}

}
