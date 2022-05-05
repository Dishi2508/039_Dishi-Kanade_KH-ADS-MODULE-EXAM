class TwoStacksInArray
{
	int a[ ];
	int size;
	int Top1, Top2;
	
	TwoStacksInArray(int n)
	{
		size = n;
		a = new int[n];
		Top1 = n/2+1;
		Top2 = n/2;
	}
	
	void push1(int x)
	{
		if(Top1>0)
		{
			Top1--;
			a[Top1] = x;
		}
		else
		{
			System.out.println("Stack Overflow");
			return;
		}
	}
	void push2(int x)
	{
		if(Top2 < size-1)
		{
			Top2++;
			a[Top2] = x;
		}
		else
		{
			System.out.println("Stack Overflow");
			return;
		}
	}
	
	int pop1( )
	{
		if(Top1 <= size/2)
		{
			int x = a[Top1];
			Top1++;
			return x;
		}
		else
		{
			System.out.println("Stack Underflow");
		}
		return 0;
	}
	
	int pop2( )
	{
		if(Top2 >= size/2+1)
		{
			int x = a[Top2];
			Top2--;
			return x;
		}
		else
		{
			System.out.println("Stack Underflow");
		}
		return 1;
	}
}

class TwoStacks
{
	public static void main(String args[ ])
	{
		TwoStacksInArray s = new TwoStacksInArray(5);
		s.push1(5);
		s.push2(7);
		s.push2(40);
		s.push1(11);
		s.push2(15);
		s.push2(10);
		//s.pop1( );
		System.out.println("Popped element from stack1 is " +s.pop1( ));
		
		//s.push2(10);
		System.out.println("Popped element from stack2 is " +s.pop2( ));
	}
}

