import java.util.Scanner;
class MatrixMulti
{
	static void printMatrix(int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

	static void multiply(int a[][], int r1, int c1, int b[][], int r2, int c2)
	{
		if(c1!= r2)
		{
			System.out.println("Multiplication not possible - wrong dimension");
			return;
		}
		
		int mul[][]= new int [r1][c2];

		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c2; j++)
			{
				for(int k=0; k<c1; k++)
				{
					mul[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}
		System.out.println("Multiplaction of 2 matrix");
		printMatrix(mul);
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
		
		multiply(arr1, r1, c1, arr2, r2, c2);

	}
}