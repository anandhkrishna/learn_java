import java.util.Scanner;
interface IntStack
{
	void push(int item);
	int pop();
}
class FixedStack implements IntStack
{
	public int stck[];

	public int top;

	FixedStack(int size)
	{
		stck = new int[size];
		top=-1;
	}
	public void push(int item)
	{
		if(top>=stck.length-1)
			System.out.println("Stack is full.");
		else
			stck[++top] = item;
	}
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stck[top--];
	}
}
class Adt
{
	public static void main(String args[]){
	FixedStack mystack1 = new FixedStack(10);
	FixedStack mystack2 = new FixedStack(15);
	int i,j,elem1,elem2;

	try
	{
		for(i=0;i<10;i++) mystack1.push(i);
		for(j=0;j<15;j++) mystack2.push(j);


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the stack 1: ");
		elem1 = sc.nextInt();
		System.out.println("The element in the " + elem1 + " position is " + mystack1.stck[elem1]);
		System.out.println("Enter the index of the stack 2: ");
		elem2 = sc.nextInt();
		System.out.println("The element in the " + elem2 + " position is " + mystack2.stck[elem2]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index exceeded");
	}
	System.out.println("Stack in mystack1: ");
	for(i=0;i<10;i++)
		System.out.println(mystack1.pop());
	System.out.println("Stack in mystack2: ");
	for(j=0;j<15;j++)
		System.out.println(mystack2.pop());
	}
}

