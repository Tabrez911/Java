package Array;
import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		int[] arr = { 10, 78, 56, -99, 76 }; //first class notation array: Array declaration + definition + initialization
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("min" + arr[0]);
		System.out.println("max" + arr[4]);
		int sum = arr[0] + arr[4];
		System.out.println("sum of min and max" + sum);
		
		String[]fruits=new String[3]; //Array declaration + definition on one line
		fruits[0]="Mango"; //Array initialization
		fruits[1]="Apple";	//Array initialization
		fruits[2]="Strawberry";	//Array initialization
		Arrays.sort(fruits);
		for(String f:fruits) {
			System.out.println(f);
		}
				
		int d[][]= {{1,2,3},{3,4,3},{5,6,3}}; //2D Array: Array declaration + definition + initialization
			
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d.length;j++) {
			System.out.print(" "+d[i][j]);
			}
		System.out.println("");
			}
		
	}
	
}
