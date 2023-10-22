import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MyCl
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> al= new ArrayList<>();
		System.out.println("Enter the length of ArrayList");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		
		for(int i=0; i<n; i++)
		{
			al.add(s.nextInt());
		}
		Collections.sort(al);
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i)+" ");
		}
	}
}