class MyCl
{
	public static int lastOccurence(int a[], int x)
	{
		int index=-1;
		for(int i=0; i<a.length; i=i+1)
		{
			if(a[i]==x)
			{
				index=i;
			}
		}
		return index;
		
		
	}
	public static void main(String arg[])
	{
		int a[]={1, 4, 7, 9, 1};
		System.out.println(lastOccurence(a, 1));
	}
}
			