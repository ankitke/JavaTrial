import java.util.Scanner;
class Table2
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter no for print Table = ");
		int n=ob.nextInt();
		for(int i=1;i<=10;i=i+1)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}	
			
			