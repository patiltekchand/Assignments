
class TowerOfHanoi
{
	
		class Stack
		{

				int stackSize;
				int stackTop;
				int stackArray[];


		}


		stack createStack(int noOfDisk)
		{
		 		Stack stackCreated=new Stack();

		 		stackCreated.stackSize=noOfDisk;
		 		stackCreated.stackTop=-1;
		 		stackCreated.stackArray=new int[noOfDisk];

		 		return stackCreated;
		}


		boolean isFullStack(Stack begin)
		{
				return(begin.stackTop==begin.stackSize-1);
		}

		void pushElement(Stack begin,int tohIteration)
		{

				if(isFullStack(begin))
				{
						return;
				}

				begin.array[++begin.stackTop] = tohIteration;

		}




		void TowerOfHanoiIteration(int noOfDisk,Stack begin,Stack middle,Stack end)
		{
				int noOfMoves,tohIteration;



				for(tohIteration=noOfDisk;tohIteration>=1;tohIteration--)
				{
					  pushElement(begin,tohIteration);
				}

				for()

		}


public static void main(String[] args)
{
		Scanner sc=new Scanner(Systm.in);
		System.out.println("Enter the number of Disk");
		int noOfDisk=sc.nextInt();

		TowerOfHanoi tower=new TowerOfHanoi();
		Stack begin,middle,end;
		
		begin=tower.createStack(noOfDisk);
		middle=tower.createStack(noOfDisk);
		end=tower.createStack(noOfDisk);

		tower.TowerOfHanoiIteration(noOfDisk,begin,middle,end);



}

}