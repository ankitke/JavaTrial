class Employee
{
	String name;
	int yoj;
	int salary;
	String address;
}
class Test
{
	public static void main(String arg[])
	{
		Employee a=new Employee();
		a.name= "Robert";
		a.yoj= 1994;
		a.address="64C- WallStreet";
		
		Employee b=new Employee();
		b.name="Ankit";
		b.yoj=2023;
		b.address="85C- AnandNagar";
		
		Employee c=new Employee();
		c.name="Deepak";
		c.yoj=2023;
		c.address="45C- Indrapuri";
		
		System.out.println("Name"+ "\t" + "Year of joining" + "\t" + "Address");
		System.out.println(a.name+ "\t" + a.yoj + "\t\t" + a.address);
		System.out.println(b.name+ "\t" + b.yoj + "\t\t" + b.address);
		System.out.println(c.name+ "\t" + c.yoj + "\t\t" + c.address);
	}
}