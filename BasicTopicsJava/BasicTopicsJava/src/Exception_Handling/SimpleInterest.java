package Exception_Handling;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		 
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter principle amount:\n");
			float amt=sc.nextFloat();
			System.out.println("Enter rate of interest:\n");
			float rate=sc.nextFloat();
			System.out.println("Enter no. of years:\n");
			int years=sc.nextInt();
			if(amt<10000)
				throw new lessamountexception();
			if(rate<0.10f|| rate>0.25f)
				throw new OutOfRangeException();
			if(years<0)
				throw new NegativeYearsException();
			float SI=amt*rate*years;
			System.out.println("Simple interest is:\t"+SI);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
