import java.util.Scanner;
class Matrix
{
	static void sum(int r1, int c1,int arr1[][], int r2, int c2, int arr2[][])
	{
		if(r1 != r2 || c1 != c2)
		{
			System.out.println("Wrong Input- Addition not process");
			return;
		}
		
		int add[][]=new int[r1][c1];
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				add[i][j] = arr1[i][j]+ arr2[i][j];
			}
		}
		printMatrix(add);
	}

	static void printMatrix(int matrix[][])
	{
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no in 1st rows in 1st Array");
		int r1=s.nextInt();
		System.out.println("Enter no in 1st columnsn in 1st Array");
		int c1=s.nextInt();
		int arr1[][]=new int [r1][c1];

		System.out.println("Enter "+r1*c1+ " Element in 1st Array");
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				arr1[i][j]=s.nextInt();
			}
		}

		System.out.println("Enter no in 2nd rows in 2nd Array");
		int r2=s.nextInt();
		System.out.println("Enter no in 2nd columns in 2nd Array");
		int c2=s.nextInt();
		int arr2[][]=new int [r2][c2];

		System.out.println("Enter "+r2*c2+ " Element in 2nd Array");
		for(int i=0; i<r2; i++)
		{
			for(int j=0; j<c2; j++)
			{
				arr2[i][j]=s.nextInt();
			}
		}

		System.out.println("Matrix 1");
		printMatrix(arr1);
		System.out.println("Matrix 2");
		printMatrix(arr2);
		
		System.out.println("Sum of 2 Matrix is");
		sum( r1, c1,arr1 , r2, c2, arr2);
	}
}