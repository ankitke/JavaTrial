import java.util.Scanner;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter no in array");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			if(Math.abs(arr[i])-1==n)
			{
				continue;
			}
			int ind=Math.abs(arr[i])-1;
			arr[ind]*=-1;
		}
		int ans=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]>0)
			{
				ans=i+1;
				System.out.println(ans);
				return;
			}
		}
		System.out.println(n+1);
	}
}
		