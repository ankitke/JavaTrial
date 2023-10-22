import java.util.Scanner;
class MyCl
{
	static int findArraySum(int arr[])
	{
		int totalSum=0;
		for(int i=0; i<arr.length; i++)
		{
			totalSum+= arr[i];
		}
		return totalSum;
	}

	static boolean equalSumPartition(int arr[])
	{
		int totalSum=findArraySum(arr);
		int prefSum=0;
		for(int i=0; i<arr.length; i++)
		{
			prefSum+=arr[i];
			int suffixSum= totalSum-prefSum;
			if(suffixSum==prefSum)
			{
				return true;
			}
			
		}
		return false;
	}

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter "+n+" elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Equal Paratition possible = "+ equalSumPartition(arr));
	}
}