import java.util.Scanner;
class Gender
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		char gen;
		String name,ge,s="Hello";
		System.out.print("Enter Name ");
		name=ob.nextLine();
		
		System.out.print("Enter Gender ");
		ge=ob.nextLine();
		gen=ge.charAt(0);
		
		if(gen=='m')
		{
			s=s+" Mr.";
		}
		else
		{
			s=s+" Ms.";
		}
		s=s+" "+name;
		System.out.print(s);
	}
}