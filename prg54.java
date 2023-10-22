class Triangle
{
	int a,b,c;
	double getArea()
	{
		double s=(a+b+c)/2.0;
		return Math.pow((s*(s-a)*(s-b)*(s-c)), .5);
	}
	double getPerimeter()
	{
		return (a+b+c)/2.0;
	}
}
class Test
{
	public static void main(String arg[])
	{
		Triangle t=new Triangle();
		t.a=2;
		t.b=5;
		t.c=6;
		System.out.println("Area of Trangle is = "+t.getArea());
		System.out.println("Perimeter of Trangle is = "+t.getPerimeter());
	}
}