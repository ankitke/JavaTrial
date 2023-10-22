import java.util.Scanner;
class Function
{
	public static void main(String ar[])
	{
	  int x;	
		
		add();
		
	}
	public static void add()
	{
x=10;
		int a,b,r;
	        Scanner s= new Scanner(System.in);
	
		System.out.println("Enter no is = ");
		a=s.nextInt();
		
		System.out.println("Enter no is = ");
		b=s.nextInt();
		r=a+b;
		System.out.println("Sum of 2 no is = "+r);
	}
}
