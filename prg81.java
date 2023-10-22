import java.util.Scanner;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the length of arrays = ");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i=i+1)
		{
			System.out.println("Enter no negitive or positive also");
			arr[i]=s.nextInt();
		}

		int ans[]= new int[n];          
		int idx=0;
		for(int i=0; i<n; i=i+1)        //Searching positive no
		{
			if(arr[i]>=0)
			{
				ans[idx]=arr[i];
				idx++;
			}
		}
		
		for(int i=0; i<n; i=i+1)          //Searching negetive no
		{
			if(arr[i]<0)
			{
				ans[idx]=arr[i];
				idx++;
			}
		}
		
		for(int i=0; i<n; i=i+1)            //print array
		{
			System.out.print(ans[i]+ "  ");
		}
		
	}
}
