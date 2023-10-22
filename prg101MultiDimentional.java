import java.util.Scanner;
class MultiDimentional
{
	static void printArray(int arr[][])
	{
		System.out.println("your Entered Array is");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int r=s.nextInt();
		System.out.println("Enter no of columns");
		int c=s.nextInt();
		int arr[][]=new int [r][c];

		System.out.println("Enter "+r*c+ " Element");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		printArray(arr);
	}
}