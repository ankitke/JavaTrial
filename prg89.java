import java.util.*;
import java.lang.*;
class MyCl
{
	public static int firstRepeated(int a[], int n)
	{
		for(int i=0; i<n; i++)
		{
			int current=a[i];
			for(int j=i+1; j<n; j++)
			{
				if(a[i]==current)
				{
					return i+1;
				}
			}
		}
		return -1;
	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=s.nextInt();
		}
		int ans= firstRepeated(a, n);
		System.out.print(ans);
	}
}