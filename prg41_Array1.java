import java.util.Scanner;
class Array1
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int i=0;
		int n[];
		n=new int[10];
		System.out.print("Enter array length = ");
		int l=s.nextInt();
		System.out.println(n[l]);
		for(i=0;i<l;i=i+1)
		{
			System.out.print("Enter no = ");
			n[i]=s.nextInt();
		}
		for(int j=0;j<i;j=j+1)
		{
				System.out.println(n[j]);
		}
		
	}
}