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

		System.out.println("Enter the Element to be swap");
		int i=s.nextInt();
		int j=s.nextInt();
		int temp=al.get(i);
		Collections.swap(al, i, j);
		for(int k=0; k<al.size(); k++)
		{
			System.out.print(al.get(k));
		}
		
	}
}