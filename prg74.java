
import java.util.*;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no ");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n; i=i+1)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("\nArray is ");
		for(int i=0; i<n; i=i+1)
		{
			System.out.println(arr[i]);
		}
	}
}