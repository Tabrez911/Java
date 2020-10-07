package collection1;

import java.util.HashMap;
import java.util.Scanner;

public class Person {

	
	public static void main(String[] args) {
		HashMap<String, String> mp= new HashMap<String, String>();
		mp.put("8805456821", "Ankita");
		mp.put("9860000144", "Anil");
		mp.put("8007351199", "Akanksha");
		mp.put("8796217168", "Akshay");
		mp.put("8087102338", "Sumit");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter contact no.\n");
		String num= sc.next();
		String name=mp.get(num);
		if(name!=null)
			System.out.println(name);
		else
			System.out.println("match not found!!");
	}

}
