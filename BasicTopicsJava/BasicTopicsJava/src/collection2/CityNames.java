package collection2;

import java.util.Properties;
import java.util.Scanner;

public class CityNames {

	
	public static void main(String[] args) {
		Properties p= new Properties();
		p.put("Pune","020");
		p.put("Mumbai","022");
		p.put("Nashik","120");
		p.put("Kolhapur","220");
		p.put("Nagpur","230");
		System.out.println("Enter city name");
		Scanner sc= new Scanner(System.in);
		String City=sc.next();
		String std_code=p.getProperty(City);
		if(std_code!=null)
			System.out.println(std_code);
		else
			System.out.println("City not found");
	}

}
