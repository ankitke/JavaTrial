import java.util.Scanner;
class MyKeshri
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no= ");
		int a=s.nextInt();
		System.out.println("Enter no= ");
		int b=s.nextInt();
		int add=ans(a,b);
		System.out.println("Sum of two no is = "+add);
	}
	static int ans(int n1, int n2)
	{
		int add =n1+n2;
		return add;
	}
}
	