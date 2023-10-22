import java.util.Scanner;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter no");
		for(int i=0; i<n; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter comparision value");
		int x=s.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[j]-a[i]==x)
				{
					System.out.print(" Yes");
					return;
				}
			}
		}
		System.out.print(" No");
	}
}