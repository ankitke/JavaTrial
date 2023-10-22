import java.util.Scanner;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array length= ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array no");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print("First occurence = "+(i+1));
					return;
				}
			}
		}
		System.out.print(-1);
	}
}
			
		