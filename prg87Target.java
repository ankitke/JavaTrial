class Target
{

	public static void main(String arg[])
	{
		int a[]={21,7,5,21,5,6,3};
		System.out.print(target(a));
	}
	public static int target(int a[])
	{
		int n=a.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1;j<n; j++)
			{
				if(a[i]==a[j])
				{
					a[i]=a[j]=-1;
				}
			}
		}
		for(int i=0; i<n; i++)
		{
			if(a[i]>0)
			{
				return a[i];
			}
		}
		return -1;
	}
}