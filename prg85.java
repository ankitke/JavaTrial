
class MyCl
{
	static int targetSum(int a[], int n)
	{
		int n1=a.length;
		int count=0;
		for(int i=0; i<n1; i=i+1)
		{
			for(int j=i+1; j<n1; j=j+1)
			{
				if(a[i]+a[j]==n)
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String arg[])
	{
		int a[]={4,7,3,5,2,6,8};
		int x=10;
		System.out.print(targetSum(a, x));
	}
}
		