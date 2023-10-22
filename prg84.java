import java.util.Scanner;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter array length");m
		int n=s.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0; i<n;i=i+1)
		{
			System.out.print("Enter no = ");
			arr1[i]=s.nextInt();
		}
		int i=0;
		boolean ans=true;

		for(i=0; i<n; i=i+1)
		{
			System.out.print("Enter no = ");
			 arr2[i]=s.nextInt();
			if(arr2[i]!=arr1[i])
			{
				ans=false;
				break;
			}
		}
		System.out.print(ans);
	}
}
	
