class MyCl
{
	public static void main(String arg[])
	{
		int a[]= {1, 4, 7, 9};
		int n=a.length;
		int b[]=a.clone();
	
		b[0]=5;
		System.out.print("Original array = ");
		for(int i=0;  i<n; i=i+1)
		{
			System.out.print(a[i]+ " ");
		}

		System.out.print("\ncloned Array = ");
		for(int i=0; i<n; i=i+1)
		{
			System.out.print(b[i]+ " ");
		}
	}
}