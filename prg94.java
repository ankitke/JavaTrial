class MyCl
{
	public static void main(String arg[])
	{
		int arr[]={1, 2, 3, -4, -1, 4};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				System.out.print(" "+arr[i]);
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
			{
				System.out.print(" "+arr[i]);
			}
		}

	}
}