import java.util.Scanner;
class Target
{
	public static void main(String arg[])
	{
		int arr[]={1,3,4,2,6,8,4};
		int n=7, ans=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==n)
				{
					ans++;
				}
			}
		}
		System.out.print("7 is come "+ans+" Times");
	}
}