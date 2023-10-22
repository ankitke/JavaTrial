class Target
{
	public static int targetSum(int a[], int n)
	{
		int count =0;
		for(int i=0;i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				for(int k=j+1; k<a.length; k++)
				{
					if(a[i]+a[j]+a[k]==n)
					{
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String arg[])
	{
		int a[]={2,5,7,3,9,8,4,10,6};
		System.out.print("3 number sum is equal to 16 = "+targetSum(a, 16)+" times");
	}
}