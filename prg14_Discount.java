class Discount
{
	public static void main(String ar[])
	{
		int a,c;
		int b=0;
		System.out.println("Enter amount");
		a=Integer.parseInt(ar[0]);
		System.out.println("Your Entered Amount is = "+a);
		if(a<1000)
		{
			b=(a*10)/100;
		}
		if(a>=1000)
		{
			b=(a*20)/100;
		}
		c= a-b;
		System.out.println("Your Discount Amount is ="+b);
		System.out.println("Your Total Amount with Discount is ="+c);
	}
}