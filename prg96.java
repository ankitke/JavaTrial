
class Reverse
{
	public static int[] reverse(int arr[])
	{
		int n=arr.length;
		int a[]=new int[n];
		int j=0;
		for(int i=n-1; i>=0; i--)
		{
			a[j++]=arr[i];	
		}
		return a;
	}	
	public static void main(String arg[])
	{
		int arr[]={ 1, 2, 3, 4, 5,6};
		int a[]=reverse(arr);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}