package Interface;

public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxable[] tax= {new Businessman(),new Batsman(),new Employee() };
		
		for(Taxable t: tax) {
			t.calTax();
		}

	}

}
