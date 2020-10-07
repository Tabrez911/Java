package Exception_Handling;

public class NegativeYearsException extends Exception {
	String msg;
	public NegativeYearsException()
	{
		msg="no. of years should be positive";
	}
	public NegativeYearsException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "NegativeYearsException [msg=" + msg + "]";
	}
	
}
