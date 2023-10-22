import java.util.Scanner;
class Power
{
	public static void main(String ar[])
	{
		int t=1;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter base = ");
		int b=ob.nextInt();
		System.out.print("Enter power = ");
		int p=ob.nextInt();
		for(int i=1;i<=p;i=i+1)
		{
			t=t*b;
		}
		System.out.print(t);
	}
}