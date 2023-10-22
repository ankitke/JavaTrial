class Compair
{
	public static void main(String ar[])
	{
		int a,b;
		String s1,s2;
		s1=ar[0];
		s2=ar[1];
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		if(a>b)
		{
			System.out.println("A is Greater");
		}
		else
		{
			if(a<b)
			{
				System.out.println("B is Greater");
			}
			else
			{
				System.out.println("Both are Equal");
			}
		}
	}
}