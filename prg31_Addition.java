import java.util.Scanner;
class Addition
{
	public static void main(String ar[])
	{
		String s;
		do
		{

		Scanner ob=new Scanner(System.in);
		System.out.print("Enter 1st no =");
		int n1=ob.nextInt();
		System.out.print("Enter 2nd no =");
		int n2=ob.nextInt();
			int r=n1+n2;
			System.out.println("Addition of 2 no is = "+r);
			System.out.println("If you want to continue enter y = ");
			 s=ob.next();
		}while(s.equals("y"));
	}
}