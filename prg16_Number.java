class NumberType
{
	public static void main(String ar[])
	{
		String ch;
		ch=ar[0];
		int n;
		n=Integer.parseInt(ch);
		if(n>=48 && n<=57)
		{
			System.out.print("Numerical Type");
		}
		else
		{
			System.out.print("Symbolic Type");
		}
		System.out.print(" Character");
	}
}