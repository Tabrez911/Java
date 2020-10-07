package Array;
import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		System.out.println("Enter two nos.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Two nos.are:\t"+a+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped nos.are:\t"+a+b);
	
	}

}
