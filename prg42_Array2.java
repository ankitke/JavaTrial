import java.util.Scanner;
class Array2
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n[][];

		System.out.print("Enter 2 no with space = ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		n=new int[n1][n2];

		for(int r=0;r<n1;r=r+1)
		{
			for(int c=0;c<n2;c=c+1)
			{
				System.out.print("Enter no = ");
				n[r][c]=s.nextInt();
			}
		}
		for(int r1=0;r1<n1;r1=r1+1)
		{
			for(int c1=0;c1<n2;c1=c1+1)
			{
				System.out.print(" "+n[r1][c1]);
				
			}
				System.out.print("\n");

		}
	}
}
		
		