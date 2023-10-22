import java.util.Scanner;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter no in array");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter value of x ");
		int x=s.nextInt();
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		System.out.println("Your occurence is "+count);
	}
}
				
		