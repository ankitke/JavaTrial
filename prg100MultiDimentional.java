class MultiDimentional
{
	static void printArray(int arr [][])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		int arr[][]={{1,2,3}, {4,5,6}, {7,8,9}};
		printArray(arr);
	}
}