
//container object
public class Employee {

	int empid;
	String empname;
	MyDate joiningDate;		//Contained object

	public Employee() {

		empid = 14;
		empname = "Ankita";
		joiningDate = new MyDate();
	}

	public Employee(int empid, String empname, MyDate joiningDate) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.joiningDate = joiningDate;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public MyDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(MyDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public void display() {
		System.out.println("Empid " + empid);
		System.out.println("Emp name " + empname);
		System.out.println("Joining date ");
		joiningDate.display();
	}

	

}
