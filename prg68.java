class MyCl
{
	public static void main(String arg[])
	{
		int arr[]={1,5,3};
		int x=5;
		int index=-1;
		for(int i=0; i<arr.length; i=i+1)
		{
			if(arr[i]==x)
			{
				index=i;
			}
		}
		System.out.println(index);
	}
}