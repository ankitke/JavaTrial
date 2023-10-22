class Student
{
    int roll;
    String name;
}
class Main
{
	public static void main(String[] args) {
	    Student obj=new Student();
	    int a=obj.roll=100;
	    String b=obj.name="Ankit";
	    
		System.out.println(a+" " +b);
	}
}