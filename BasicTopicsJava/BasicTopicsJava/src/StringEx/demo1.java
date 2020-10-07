package StringEx;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Hello";
		String s2= s1.concat("Tabrez");
		System.out.println(s2);
		String s3=s1.replace(s1, "Kasu");
		System.out.println(s3);
		
		System.out.println(s1);
		String s4= "Hello";
		
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);

	}

}
