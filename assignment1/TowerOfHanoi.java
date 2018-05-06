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
		 		Stack stackCreated=new Stack();

		 		stackCreated.stackSize=noOfDisk;
		 		stackCreated.stackTop=-1;
		 		stackCreated.stackArray=new int[noOfDisk];

		 		return stackCreated;
		}


		boolean isEmptyStack(Stack begin)
		{
			  return (begin.stackTop==-1);
		}

		boolean isFullStack(Stack begin)
		{
				return(begin.stackTop==begin.stackSize-1);
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
      //  System.out.println(noOfElements);
				begin.stackArray[++begin.stackTop] = element;
		}

		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number of Disk");
				int noOfDisk=sc.nextInt();

				TowerOfHanoi tower=new TowerOfHanoi();
				Stack begin,middle,end;

				begin=tower.createStack(noOfDisk);
				tower.pushElement(begin,noOfDisk);
				tower.popElement(begin);



		}



}