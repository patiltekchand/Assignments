import java.util.Scanner;

class AndOrOperation
{
	Scanner sc=new Scanner(System.in);
	
	public void acceptArray()
	{
		int innerLoop,outerLoop,rows,column;
		System.out.println("Enter the rows");
		rows=sc.nextInt();
		System.out.println("Enter the columns");
		column=sc.nextInt();

		int firstArray[][]=new int[rows][column];
		int secondArray[][]=new int[rows][column];

		
		
		
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
				int resultArray[][]=new int[rows][column];
			  System.out.println("And Operation is:");
				for(outerLoop=0;outerLoop<rows;outerLoop++)
				{
					for(innerLoop=0;innerLoop<column;innerLoop++)
					{
						resultArray[outerLoop][innerLoop]=firstArray[outerLoop][innerLoop] & secondArray[outerLoop][innerLoop];
						System.out.println(resultArray[outerLoop][innerLoop]);
					}
				}

				//	AndOrOperation operation=new AndOrOperation();
					AndOrOperation(resultArray,firstArray,rows,column);

			}

			public void AndOrOperation(int resultArray[][],int firstArray[][],int rows,int column)
			{
				int lengthOf=rows*column;
				int singleArray[]=new int[lengthOf];
				int outerLoop,innerLoop;
				int len=0;
				System.out.println("OR Operation is:");
				for(outerLoop=0;outerLoop<rows;outerLoop++)
				{
					for(innerLoop=0;innerLoop<column;innerLoop++)
					{
						singleArray[len]=resultArray[outerLoop][innerLoop] | firstArray[outerLoop][innerLoop];
						//System.out.println(singleArray[len]);
						
						//if(innerLoop<=(column-1))
						{
							
							len++;
						
						}
					}
				}

					decimalOperation(singleArray);

			}

			public void decimalOperation(int singleArray[])
			{
					int len;
					int singleArraylen=0;
					int decimal=0;
					int lengthOf=singleArray.length;
					System.out.println("Decimal is:");
					for(len=0;len<lengthOf;len++)
					{
						
								
							decimal +=singleArray[len]*Math.pow(2, singleArraylen);
							singleArraylen++;

					}
					System.out.println(decimal);
					checkPrime(decimal);

			}

			public void checkPrime(int decimal)
			{
					int outerLoop,is_prime=0;
					for(outerLoop=2;outerLoop<decimal/2;outerLoop++)
					{
							if(decimal%outerLoop==0)
							{
									is_prime=1;
									break;
							}
							else
							{
									continue;
							}
					}
							if(is_prime==0)
							{
									System.out.println("is_prime\n"+decimal);
							}
			}




	public static void main(String[] args)
	{

				
		AndOrOperation operation=new AndOrOperation();
		operation.acceptArray();




	}




}