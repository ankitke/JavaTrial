class MyCl
{
	static void swapInArray(int arr[], int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void recerseArray(int arr[])
	{
		int i=0,  j=arr.length;
		while(i<j)
		{
			swapInArray(arr, i, j);
			i++;
			j--;
		}
	}
	public static void main(String arg[])
	{
		int arr[]={ 1, 2, 3, 4, 5,6};
		recerseArray(arr);
	}
}
		
j