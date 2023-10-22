import java.util.Scanner;
class Area
{
	int length;
	int breadth;
	Area(int l, int b)
	{
		length=l;
		breadth=b;
	}
	int getArea()
	{
		int r=length*breadth;
		return r;
	}
}
class Test
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length");
		int x=s.nextInt();
		System.out.println("Enter breadth");
		int y=s.nextInt();
		
		Area a= new Area(x,y);
		System.out.println("Area =  "+a.getArea());
	}
}