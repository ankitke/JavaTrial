import java.util.Scanner;
class Factorial
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no for factorial = ");
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i=i+1)
		{
			fact=fact*i;
			System.out.print(i+"x");
		}
		System.out.print("="+fact);
	}
}
		