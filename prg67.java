class MyCl
{
	public static void main(String arg[])
	{
		int arr[]={1,3,5,8,7};
		int max=arr[0];
		for(int i=0; i<arr.length; i=i+1)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}