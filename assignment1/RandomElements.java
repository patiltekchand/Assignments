import java.util.Scanner;
class RandomElements
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sizeOfArray,randomNumber,repeatedTimes,innerLoop,outerLoop,countRepeat=0;
		System.out.println("Enter the size of array");
		sizeOfArray=sc.nextInt();
		int array_element[]=new int [sizeOfArray];
		int array_repeat[]=new int [sizeOfArray];
		System.out.println("Enter the Random number");
		randomNumber=sc.nextInt();
		
		System.out.println("Enter the array_element");

		for(innerLoop=0;innerLoop<sizeOfArray;innerLoop++)
		{
			
			array_element[innerLoop]=sc.nextInt();
			array_repeat[innerLoop]=-1;
		}

		repeatedTimes=sizeOfArray/randomNumber;

		for(outerLoop=0;outerLoop<sizeOfArray;outerLoop++)
		{
			 
		 		countRepeat=1;

			for(innerLoop=outerLoop+1;innerLoop<sizeOfArray;innerLoop++)
			{
					if(array_element[outerLoop]==array_element[innerLoop])
					{
						
							array_repeat[innerLoop]=0;
							countRepeat++;
						
					}

			}
				if(array_repeat[outerLoop]!=0)
				{
						array_repeat[outerLoop]=countRepeat;
				}

			/*	if(countRepeat>=repeatedTimes)
				{

						System.out.println(array_element[outerLoop]+" is element of array which appears sizeOfArray/randomNumber");
						System.out.println(countRepeat+"times");
				}*/
		}
			
				for(outerLoop=0;outerLoop<sizeOfArray;outerLoop++)
				{

						if(array_repeat[outerLoop]!=0)
						{
								if(array_repeat[outerLoop]>=repeatedTimes)
								{
										System.out.println(array_element[outerLoop]+" is element of array which appears sizeOfArray/randomNumber");
										System.out.println(array_repeat[outerLoop]+"times");
								}

						}
				}
				

	}

}