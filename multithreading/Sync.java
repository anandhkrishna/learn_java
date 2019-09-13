import java.lang.Math;
class RandomNumbeR
{
	int getrandom() 
	{
		double random1 = Math.random();
		double random2 = random1 * 10;
		int random3 = (int) random2;
		return random3;
	}
}
class Square implements Runnable
{
	int num;
	Thread t;

	Square(String string)
	{
		num = Integer.parseInt(string);
		t = new Thread(this);
		t.start();
	}
	public void run() 
	{
		synchronized(t) 
		{
			int square = num*num;
			System.out.println("Square is: "+square);
		}
	}
}


class Cube implements Runnable
{
	int num1;
	Thread t;

	Cube(String string1)
	{
		num1 = Integer.parseInt(string1);
		t = new Thread(this);
		t.start();
	}
	public void run() 
	{
		synchronized(t) 
		{
			int cube = num1*num1*num1;
			System.out.println("Cube is: " +cube);
		}
	}

}

public class Sync 
{
	public static void main(String [] args)
	{
		RandomNumbeR randomNumbeR = new RandomNumbeR();
		for(int i = 0; i < 5; i++) 
		{
			int r = randomNumbeR.getrandom();
			String s = ""+r;
			System.out.println("The random number is: "+s);
			if(r % 2 == 0) 
			{
				Square square1 = new Square(s);
			}
			if(r % 2 != 0)
			{
				Cube cube1 = new Cube(s);
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) 
			{
				System.out.println("Main thread interrupted");
			}
		}

	}
}