class  MyClmain
{
	public static void main(String ar[])
	{
		MyCl1 ob=new MyCl1();
		ob.myFun1();
	}
}
class MyCl1
{
	int a,b;
	MyCl1()
	{
		a=10;
		b=20;
	}
	void myFun1()
	{
		int r=a+b;
		System.out.println("Sum of 2 no is = "+r);
	}
}
