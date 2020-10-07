package Interface;

public class Businessman implements Taxable{
	
	String name;

	public Businessman() {
		name="Tabrez";
	}

	public Businessman(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void calTax() {
		// TODO Auto-generated method stub
		
		System.out.println("Businessman's Tax calculated");
	}
	
	

}
