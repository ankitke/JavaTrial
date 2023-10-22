import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of ArrayList");
		int n=s.nextInt();

		ArrayList<Integer>al= new ArrayList<>();
		System.out.println("Enter the Element of ArrayList");
		for(int i=0; i<n; i++)
		{
			al.add(s.nextInt());
		}

		System.out.println("Enter the Element to be inserted");
		int x= s.nextInt();
		al.add(0, x);
		for(int k=0 ; k<al.size(); k++)
		{
			System.out.println(al.get(k));
		}

		al.remove(3);
		for(int k=0 ; k<al.size(); k++)
		{
			System.out.println(al.get(k));
		}
	}
}