package collection5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class CustDetails {


	public static void main(String[] args) {
		TreeSet<Customer> ts=new TreeSet<>();
		ts.add(new Customer(12,"ABC","washing machine",27078.45f));
		ts.add(new Customer(13,"DEF","Refridgerator",34078.9f));
		ts.add(new Customer(14,"PQR","LED TV",39078.4f));
		ts.add(new Customer(15,"Akanksha","Microwave oven",29078.4f));
		
		for(Object t:ts)
		{
			System.out.println(t);
		}
	}

}
