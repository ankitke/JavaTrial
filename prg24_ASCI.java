import java.util.Scanner;
class ASCI
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no 65 to 90 = ");
		int n=s.nextInt();
  		if(n>=65 && n<=90)
		{
			for(n=65;n<=90;n=n+1)
			{
				System.out.println("ASCI code is "+n+ " is "+ (char)n);	
			}
		}
		else
		{
			System.out.println("you are not entered valid number");
		}
	}
}