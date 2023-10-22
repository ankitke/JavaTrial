import java.util.Scanner;
import java.util.Arrays;
class Test
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of Array ");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i=i+1)
		{
			System.out.print("Enter no = ");
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<n; i=i+1)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("Enter index in sorted array= ");
		int k=s.nextInt();
		System.out.print(arr[k-1]);
	}
}