//import java.util.*;
//import java.lang.*;
class Target
{
	public static int secondLargestValue(int [] a)
	{
		int n=a.length;
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0; i<n; i=i+1)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		for(int i=0; i<n; i=i+1)
		{
			if(a[i]!= max)
			{
				if(a[i]>smax)
				{
					smax=a[i];
				}
			}
		}
		return smax;
	}
	public static void main(String arg[])
	{
		int a[]= {21, 9, 3, 21, 5, 8, 5};
		System.out.println(secondLargestValue(a));
	}
}