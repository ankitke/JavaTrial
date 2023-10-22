class MyCl
{
	public static void main(String ar[])
	{
		int v;
		v=Integer.parseInt(ar[0]);
		for(int i=v;i<=50;i=i+1)
		{
			if(i%2==0)
			{
				System.out.println("Your Enter no is "+ i+" Even");
				
				
			}
			else
			{
				System.out.println("Your Enter no is "+i+ "odd");
				
			}
			
		}
	}
}