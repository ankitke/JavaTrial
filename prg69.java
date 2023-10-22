import java.util.Scanner;
class MyCl1
{
	public static void main(String arg[])
	{
		int i=0, j=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array length = ");
		int n=s.nextInt();

		int arr[]=new int[n];
		for(i=0; i<n; i=i+1)
		{
			System.out.print("Enter no = ");
			arr[i]=s.nextInt();
			
		}
		for(j=0; j<i; j=j+1)
		{
			System.out.println(arr[j]+" ");
			
		}
		System.out.print("Enter no for Searching = ");
		int x=s.nextInt();
		int index=-1;
		int v=0;
		
		for(int k=0; k<arr.length; k=k+1)
		{
			if(arr[k]==x)
			{
				index=k;
				v=arr[k];
			}
		}
		System.out.println("Your searching value index is = "+index);
		System.out.println("Your searching value is = "+v);
		
	}
}
			