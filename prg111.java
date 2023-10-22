import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Test
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element of Array");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}

		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			if(arr[i]>=0)
			{
				al.add(arr[i]);
			}
		}
		if(al.size()== 0)
		{
			System.out.println("NA");
			return;
		}
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i)+ "  ");
		}
	}
}