package Exception_Handling;

public class lessamountexception extends Exception {
	String msg;
	public lessamountexception()
	{
		msg="Amount must be >10000";
		
	}
	
	public lessamountexception(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "lessamountexception [msg=" + msg + "]";
	}
	
	

}
