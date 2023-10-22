class Discount2
{
	public static void main(String ar[])
	{
		float amt;
		String s;
		s=ar[0];
		float d,bill,damt;
		amt=Float.parseFloat(s);		
		d=(amt<=1000)?.10:(amt<=5000)?.20:(amt<=10000)?.30:.40;
		{
			damt=amt*d;
			bill=amt-damt;
			System.out.print("Amount is ="+amt);
			System.out.print("Discount is ="+d);
			System.out.print("Bill is ="+bill); 			
			
		}
	}
}