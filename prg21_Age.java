import java.util.Scanner; 
class Age
{
	public static void main(String ar[])
	{
		int age;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your Age =");
		age=s.nextInt();
		System.out.print("You are ");
		if(age<18)
		{
  			System.out.print("not ");
		}
		else
		{
			System.out.print("");
		}
		System.out.print("elegable for vote");
	}
}