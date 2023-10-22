import java.util.Scanner;
class UserInput
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your name =");
		String name=s.next();
		System.out.print(name);	

		//System.out.print("Enter your Gender =");
		//char gen=s.charAt(0);
		
		//System.out.print("Enter your Age =");
		//int age=s.nextInt();
		
		//System.out.print("Enter your ph no =");
		//long l=s.nextLong();

		System.out.print("Enter value of pi =");
		float pi=s.nextFloat();

	}
}