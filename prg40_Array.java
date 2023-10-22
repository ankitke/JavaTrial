import java.util.Scanner;
class Arg0
{
	public static void main(String ar[])
	{
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter file name");
		String n=s.next();
		int a;
		a=ar.length;
		for(i=0;i<=a;i=i+1)
		{
			if(n.equals(ar[i]))
			{
				System.out.println("Found");
				break;
			}
		}
	}
}