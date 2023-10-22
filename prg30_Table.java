import java.util.Scanner;
class Table
{
	public static void main(String ar[])
	{
		Scanner ob =new Scanner(System.in);
		System.out.print("Enter any no =");
		int n=ob.nextInt();
		int res=0;
		for(int v=1;v<=10;v=v+1)
		{
			int a=v*n;
			System.out.println(v*n);
			res=res+a;
		}
		System.out.print(res);
	}
}
