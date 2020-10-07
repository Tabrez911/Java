package methodOverloading;

public class Addition {

	int add(int a,int b)
	{
		System.out.println(a+b);
		return 0;
	}
	int add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		return 0;
	}
	int add(int a,float b)
	{
		System.out.println(a+b);
		return 0;
	}
	int add(float a,int b)
	{
		System.out.println(a+b);
		return 0;
	}
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(2, 3);
		a.add(10, 10, 10);
		a.add(3, 4.4f);
		a.add(6.7f, 3);
		
	}

}
