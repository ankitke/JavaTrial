
class MyCl
{
	public static int countOfElement(int a[], int x)
	{
		int count =0;
		for(int i=0; i<a.length; i=i++)
		{
			if(a[i]>x)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String arg[])
	{
		int a[]={1, 4, 7, 9, 1};
		countOfElement(a, 1);
		System.out.print("count");
	}
	
}
