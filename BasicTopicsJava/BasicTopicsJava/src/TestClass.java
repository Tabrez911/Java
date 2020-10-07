
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		//e1.setEmpid(10);
		//e1.setEmpname("dsgdfh");
		e1.display();
		
		Employee e2 = new Employee(18, "Tabrez", new MyDate(14, 9, 2020));
		e2.display();

	}

}
