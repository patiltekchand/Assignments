import java.util.Scanner;
class RandomElements
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int array_element[]=new int [100];
		int array_repeat[]=new int [100];
		
		int sizeOfArray,randomNumber,repeatedTimes,innerLoop,outerLoop,countRepeat=0;
		System.out.println("Enter the size of array");
		sizeOfArray=sc.nextInt();
		System.out.println("Enter the Random number");
		randomNumber=sc.nextInt();
		
		System.out.println("Enter the array_element");

		for(innerLoop=0;innerLoop<sizeOfArray;innerLoop++)
		{
			
			array_element[innerLoop]=sc.nextInt();
			
		}

		repeatedTimes=sizeOfArray/randomNumber;

		for(outerLoop=0;outerLoop<sizeOfArray;outerLoop++)
		{
			 
		 		countRepeat=1;

			for(innerLoop=outerLoop+1;innerLoop<sizeOfArray;innerLoop++)
			{
				if(array_element[outerLoop]==array_element[innerLoop])
				{
					
					
					countRepeat++;
					
				}

			}

				if(countRepeat>=repeatedTimes)
				{

						System.out.println(array_element[outerLoop]+" is element of array which appears sizeOfArray/randomNumber");
						System.out.println(countRepeat+"times");
				}
		}
			
				
				

	}

}