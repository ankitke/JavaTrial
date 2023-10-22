import java.util.Scanner;
class Table
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter no for print Table = ");
		int n=ob.nextInt();
		for(int i=n;i<=n*10;i=i+n)
		{
			System.out.println(i);
		}
	}
}