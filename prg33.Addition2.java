import java.util.Scanner;
class Addition2
{
	public static void main(String ar[])
	{
		int a,i;
		int r=0;
		Scanner ob=new Scanner(System.in);
		for( i=1;i<=10;i=i+1)
		{
			System.out.print("Enter no = ");
			a=ob.nextInt();
			if(a%10!=0)
			{
				
				r=r+a;
			}
			else
			{
				break;
			}
			
		}
		int s=i-1;
		System.out.print("Total "+s+ " number Addition is = "+r);
	}
}
