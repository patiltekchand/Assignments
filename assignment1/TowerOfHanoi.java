import java.util.Scanner;
class TowerOfHanoi
{

		class Stack
		{
				int stackSize;
				int stackTop;
				int stackArray[];
		}


				Stack createStack(int noOfDisk)
				{
				 		Stack stackCreated = new Stack();

				 		stackCreated.stackSize = noOfDisk;
				 		stackCreated.stackTop = -1;
				 		stackCreated.stackArray = new int[noOfDisk];

				 		return stackCreated;
				}


				boolean isEmptyStack(Stack begin)
				{
					  return (begin.stackTop == -1);
				}

				boolean isFullStack(Stack begin)
				{
						return(begin.stackTop == begin.stackSize-1);
				}

				int popElement(Stack begin)
				{
							if(isEmptyStack(begin))
							{

									return -3;
							}

					 return begin.stackArray[begin.stackTop--];

				}

				void pushElement(Stack begin,int element)
				{

						if(isFullStack(begin))
						{
							System.out.println("Stack is full");
								return;
						}

						begin.stackArray[++begin.stackTop] = element;

				}


	void TowerOfHanoiIteration(int noOfDisk,Stack begin,Stack middle,Stack end)
		{
				int totalnoOfMoves,tohIteration;


         char s = 'S',e = 'E',m = 'M';

        if (noOfDisk%2 == 0)
        {
            char temp = e;
            e = m;
            m = temp;
        }

        totalnoOfMoves=(int)(Math.pow(2, noOfDisk)-1);

				for(tohIteration = noOfDisk;tohIteration >= 1;tohIteration--)
				{
					  pushElement(begin,tohIteration);
				}

				 for (tohIteration = 1;tohIteration <= totalnoOfMoves; tohIteration++)
        {
            if (tohIteration %3 == 1)
            {
              moveDisksBetweenTwoPoles(begin, end, s, e);
            }

            else if (tohIteration % 3 == 2)
              moveDisksBetweenTwoPoles(begin, middle, s, m);

            else if (tohIteration % 3 == 0)
              moveDisksBetweenTwoPoles(middle, end, m, e);
        }

		}

		 void moveDisk(char from, char to, int disk)
    {
        System.out.println("Move the disk "+disk +
                        " from "+from+" to "+to);
    }

		void moveDisksBetweenTwoPoles(Stack begin, Stack end,
                                            char s, char e)
    {
        int pole1TopDisk = popElement(begin);
        int pole2TopDisk = popElement(end);


        if (pole1TopDisk == -3)
        {
            pushElement(begin, pole2TopDisk);
            moveDisk(e, s, pole2TopDisk);
        }

        else if (pole2TopDisk == -3)
        {
            pushElement(end, pole1TopDisk);
            moveDisk(s, e, pole1TopDisk);
        }

        else if (pole1TopDisk > pole2TopDisk)
        {
            pushElement(begin, pole1TopDisk);
            pushElement(begin, pole2TopDisk);
            moveDisk(e, s, pole2TopDisk);
        }

        else
        {
            pushElement(end, pole2TopDisk);
            pushElement(end, pole1TopDisk);
            moveDisk(s, e, pole1TopDisk);
        }
    }




			public static void main(String[] args)
			{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the number of Disk");
					int noOfDisk=sc.nextInt();

					TowerOfHanoi tower=new TowerOfHanoi();
					Stack begin,middle,end;

					begin = tower.createStack(noOfDisk);
					middle= tower.createStack(noOfDisk);
					end = tower.createStack(noOfDisk);

					tower.TowerOfHanoiIteration(noOfDisk,begin,middle,end);



			}


}