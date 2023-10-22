class MyCl
{
	public static void main(String arg[])
	{
		String arr[]={"ab", "bc", "cd", "de", "ef", "fg", "gh"};
		for(int i=0; i<arr.length; i=i+1)
		{
			if(i % 2 != 0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}
}