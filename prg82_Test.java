import java.util.Scanner;
class Test
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of arrays");
		int n=s.nextInt();
		int m=s.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0; i<n; i=i+1)
		{
			System.out.print("Enter no in array 1 = ");
			a[i]=s.nextInt();
		}
		for(int i=0; i<m; i=i+1)
		{
			System.out.print("Enter no in array 2 = ");
			b[i]=s.nextInt();
			boolean check=false;
			for(int j=0; j<n; j=j+1)
			{
				if(b[i] == a[j])
				{
					check= true;
					break;
				}
			}
			if(!check)
			{
				System.out.println(b[i]);
			}
		}
	}
}
		