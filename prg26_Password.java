import java.util.Scanner;
class Password
{
	public static void main(String ar[])
	{
		String s1,s2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your Password = ");
		s1=s.nextLine();
		System.out.print("Re Enter Password = ");
		s2=s.nextLine();
		if(s1.equals(s2))
		{
			System.out.print("Your Password is Correct ");
		}
		else
		{
			System.out.print("Your Passord is Incorrect ");
		}
	}
}