import java.util.Scanner;

class AndOrOperation
{
	Scanner sc;
	public void acceptArray()
	{
		int firstArray[][]=new int [100][100];
		int secondArray[][]=new int[100][100];
		sc=new Scanner();
		int innerLoop,outerLoop,rows,column;
		System.out.println("Enter the rows");
		rows=sc.nextInt();
		System.out.println("Enter the columns");
		column=sc.nextInt();
		
		System.out.println("Enter the 1st 2d array");

		for(outerLoop=0;outerLoop<rows;outerLoop++)
		{
			for(innerLoop=0;innerLoop<column;innerLoop++)
			{
				firstArray[outerLoop][innerLoop]=sc.nextInt();
			}
		}

		System.out.println("Enter the 2nd 2d array");

		for(outerLoop=0;outerLoop<rows;outerLoop++)
		{
			for(innerLoop=0;innerLoop<column;innerLoop++)
			{
				secondArray[outerLoop][innerLoop]=sc.nextInt();
			}
		}




	}
			public void AndOROperation(int firstArray[][],int secondArray[][])






	public static void main(String[] args)
	{

				
		AndOrOperation operation=new AndOrOperation();
		operation.acceptArray();




	}




}