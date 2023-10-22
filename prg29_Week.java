import java.util.Scanner;
class Week
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any number Between 1 to 7 =");
		String n=ob.next();
		switch(n)
		{
			case "1":
			case "Sun":
			case "S":
			case "s":
					System.out.print("Sunday");
					break;
			case "2":
			case "Mon":
			case "M":
			case "m":
					System.out.print("Monday");
					break;
			case "3":
			case "Tue":
			case "T":
			case "t":
					System.out.print("Tuesday");
					break;
			case "4":
			case "Wed":
			case "W":
			case "w":
					System.out.print("Wednesday");
					break;
			case "5":
			case "Thu":
			case "T":
			case "t":
					System.out.print("Thursday");
					break;
			case "6":
			case "Fri":
			case "F":
			case "f":
					System.out.print("Friday");
					break;
			case "7":
			case "Sat":
			case "S":
			case "s":
					System.out.print("Saturday");
					break;
			default:
					System.out.print("please Enter correct number");
		}
	}
}