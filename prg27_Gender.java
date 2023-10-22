import java.util.Scanner;
class Gender
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your Gender ");
		String s1=s.next();
		System.out.print("Hello ");
		if(s1.equals("m"))
		{
			System.out.print("Mr.");
		}
		else
		{
			 if(s1.equals("f"))
			 {

				System.out.print("Ms.");
			 }
			
			else
			{
				System.out.print("Others");
			}
		}
	}
}
					