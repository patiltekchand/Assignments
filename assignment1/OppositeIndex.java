import java.util.Scanner;
class OppositeIndex
{
    
    
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[100][100];
		int i,j,sum=0,m,n,k,total=0,digit=0,is_prime=0;

		System.out.println("Enter the rows");
		m=sc.nextInt();
		System.out.println("Enter the Columns");
		n=sc.nextInt();

		System.out.println("Enter the Elements of Matrices");
		
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}


		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				is_prime=0;
				sum=a[i][j]+a[j][i];
				//odd=sum;

				for(k=2;k<=sum/2;k++)
				{
					if(sum%k==0)
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
					total=0;
					
					while(sum>0)
					{
						digit=sum%10;
						sum=sum/10;
						total=total+digit;
						//odd=total;
						//System.out.println(odd);

					}

					if(total%2==1)
					{
						System.out.println("Number is prime="+a[i][j]+" "+a[j][i]+" "+"sum of digit is odd="+total);
					}


				}
			}
		}

	}

}