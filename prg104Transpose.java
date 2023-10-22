import java.util.Scanner;
class Transpose
{
	static int [][] findTranspose(int matrix[][], int r, int c)
	{
		int ans[][]= new int [c][[r];
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				ans[i][j]= matrix[j][i];
			}
		}
		return ans;
	}
	static void printMatrix(int arr[][])
	{
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
		System.out.println("Enter rows & columns ");
		int r=s.nextInt();
		System.out.println();
		int c=s.nextInt();

		int arr[][]=new int[r][c];
		int totalElement=r*c;
		
		System.out.println("Enter "+totalElement+" no in Matrix");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Original Matrix");
		printMatrix(arr);

		System.out.println("Transpose Matrix");
		int ans[][]= findTranspose(arr, r, c);
		printMatrix(ans);
	}
}