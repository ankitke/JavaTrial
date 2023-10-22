import java.util.Scanner;
class Type
{
	public static void main(String ar[])
	{
 		Scanner s = new Scanner(System.in);
		char ch;
		int n;
		n=(int)ch;
		System.out.print("Enter Character =");
		ch = s.charAt(0);
		System.out.print("Your character is ");
		if(n>=48 && n<=57)
		{
			System.out.print("Numerical Type");
		}
		else
		{
			System.out.print("Symbolic Type");
		}
	}
}