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
			//AndOrOperation operation=new AndOrOperation();
			AndOperation(firstArray,secondArray,rows,column);



	}
			public void AndOperation(int firstArray[][],int secondArray[][],int rows,int column)
			{
				int innerLoop,outerLoop;
				int resultArray[][]=new int[100][100];
				System.out.println("enter in and");
				for(outerLoop=0;outerLoop<rows;outerLoop++)
				{
					for(innerLoop=0;innerLoop<column;innerLoop++)
					{
						resultArray[outerLoop][innerLoop]=firstArray[outerLoop][innerLoop] && secondArray[outerLoop][innerLoop];
						
					}
				}

				//	AndOrOperation operation=new AndOrOperation();
					AndOperation(resultArray,firstArray,rows,column);

			}

			public void AndOrOperation(int resultArray[][],int firstArray[][],int rows,int column)
			{

				int singleArray[]=new int[100];
				int outerLoop,innerLoop;

				for(outerLoop=0;outerLoop<rows;outerLoop++)
				{
					for(innerLoop=0;innerLoop<column;innerLoop++)
					{
						singleArray[innerLoop]=resultArray[outerLoop][innerLoop] || firstArray[outerLoop][innerLoop];
						
					}
				}
			}




	public static void main(String[] args)
	{

				
		AndOrOperation operation=new AndOrOperation();
		operation.acceptArray();




	}




}