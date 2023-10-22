class ResultPercentage
{
	public static void main(String ar[])
	{
		float p;
		p=Float.parseFloat(ar[0]);
		System.out.print("You are");
		if(p<35.0)
		{
			System.out.print(" Fail ");
		}
		else
		{
			if(p<45.0)
			{
				System.out.print(" 3rd ");
			}
			else
			{
				if(p<60.0)
				{
					System.out.print(" 2nd ");
				}
				else
				{
					System.out.print(" 1st ");
				}
			}
		}
		System.out.print("Devision");
	}
}