package Exception_Handling;

public class OutOfRangeException extends Exception {
String msg;
public OutOfRangeException()
{
	msg="rate should be in range between 0.10 to 0.25";
}
public OutOfRangeException(String msg) {
	super();
	this.msg = msg;
}
@Override
public String toString() {
	return "OutOfRangeException [msg=" + msg + "]";
}

}
