import java .util.Scanner;
class PrefixSum
{
	static void printArray(int arr[])
	{
	}
	static int[] pSum(int arr[])
	{
		int n=arr.length;
		int pref[]=new int[n];
		pref[0]=arr[0];

		for(int i=0; i<n; i++)
		{
			pref[0]=pref[i-1]+arr[i];
		} 
		return pref;
	}
			
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=s.nextInt();
		int arr[]=new int [n];

		System.out.println("Enter no in array");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("Print Array");
		printArray(arr);
		int pref1[]=pSum(arr);
		System.out.print(pref1);
	}
}