package collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Friends {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("Ankita");
		a.add("Gautami");
		a.add("Akanksha");
		a.add("Shubham");
		a.add("Akshay");
		a.add("Manish");
		a.add("Sumit");
		a.add("Kiran");
		System.out.println("Unsorted list\n");
		for(Object f:a)
		{
			System.out.println(f);
		}
		System.out.println("sorted list\n");
		Collections.sort(a);
		Iterator itr=a.iterator();
		itr.next();
		itr.next();
		itr.next();
		itr.remove();
		itr.next();
		
		for(Object f:a)
		{
			System.out.println(f);
		}

	}

}
