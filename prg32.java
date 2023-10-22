import java.util.Scanner;
class Identify
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter your Gender = ");
		String g=ob.next();
		char ch=g.charAt(0);
		System.out.print("Enter your Age = ");
		int age=ob.nextInt();
		System.out.print("Hello ");
		if(ch=='m' || ch=='M')
		{
			System.out.println("Mr. You are Male ");
			if(age>=21)
			{
				System.out.println("Mr. you are Boy for marriage ");
			}
			else
			{
				System.out.println("Mr. You are not Boy for marriage ");
			}
		}
		else
		{
			if(ch=='f' || ch=='F')
			{
				System.out.println(" Ms. You are Female ");
				if(age>=18)
				{
					System.out.println("Ms. You are Girl for marriage ");
				}
				else
				{
					System.out.println("Ms. You are not Girl for marriage ");
				}
			}
		}
	}
}
		