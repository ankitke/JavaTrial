import java.util.ArrayList;
class MyCl
{
	public static void main(String arg[])
	{
		ArrayList<Integer> a= new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		for(int i=0;i<a.size(); i++)
		{
			System.out.print(a.get(i));
		}

		System.out.println(a.get(2));

		a.add(2, 10);
		System.out.println(a);

		a.set(1, 5);
		System.out.println(a);

		a.remove(1);
		System.out.println(a);

		ArrayList l=new ArrayList();
		
		l.add(6);
	
		System.out.println(l);
	}
}