class LeapYear
{
	public static void main(String ar[])
	{
		int year;
		year=Integer.parseInt(ar[0]);
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Your Entered Year is Leap Year");
				}
				else
				{
					System.out.println("Your Entered Year is not a Leap Year");
				}
			}
			else
			{
				System.out.println("Your Entered Year is Leap Year");
			}
		}
		else
		{
			System.out.println("Your Entered Year is not a Leap Year");
		}
		
	}
}