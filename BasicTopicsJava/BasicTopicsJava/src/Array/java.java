package Array;
import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //
		int[] array = new int[4];
		while (n > 0) {
			for (int i = 0; i < array.length; i++) {
				array[i] = n % 10;
				n= n/10;

			}
			int sum = array[0] + array[2];
			System.out.println("sum = " + sum);
			if (sum % 2 == 0) {
				System.out.println("Valid code");
			} else
				System.out.println("invalid code");

		}

	}
}
