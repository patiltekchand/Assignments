import java.util.Scanner;
class PrimeNumber
{
	Scanner sc;
	public void acceptarray(int rows)
	{
		sc=new Scanner(System.in);

		int array[]=new int [100];
		System.out.println("Accept array");
		for(int index=1;index<=rows;index++)
		{
			array[index]=sc.nextInt();
		}

		PrimeNumber primeNo=new PrimeNumber();
		primeNo.prime(rows,array);

	}

	public void prime(int rows,int array[])
	{
		int is_prime=0,primeNumber=0;

		for(int index=1;index<=rows;index++)
		{
			for(int index1=2;index1<=array[index]/2;index1++)
			{
				if(array[index]%2==0)
				{
					is_prime=1;
				}
				else
				{
					is_prime=0;
					break;
				}
			}

				if(is_prime==1)
				{
					System.out.println(array[index]);
				}
		}

	}

	public static void main(String[] args)
	{
 		Scanner sc=new Scanner(System.in);

 		int rows;
 		System.out.println("Enter the size of array");
 		rows=sc.nextInt();
 		PrimeNumber primeNo=new PrimeNumber();
 		primeNo.acceptarray(rows);
 		

	}
}