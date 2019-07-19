import java.util.Scanner;
class Tolarea
{
	public int a;
	public int b;
	public int c;
	public int d;
	public int area;
	void triangle()
	{
		area=a*b;
		System.out.println("area of the triangle="+area*0.5);
	}
	void square()
	{	
		area=a*b;
		System.out.println("area of the square="+area);
	}
	void rectangle()
	{
		area=a*b;
		System.out.println("area of the rectangle="+area);
	}
	void volume()
	{
		area=a*b*c;
		System.out.println("volume="+area);
	}
}
class Area
{
	public static void main(String args[])
	{
		int i,j,k;
		Tolarea ch=new Tolarea();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your dimension:");
		ch.d=scan.nextInt();
		i=ch.d;
		System.out.println("enter the first unit:");	
		ch.a=scan.nextInt();
		System.out.println("enter the second unit:");
		ch.b=scan.nextInt();
		ch.square();
		ch.triangle();
		j=ch.a;
		k=ch.b;
		if(j!=k)
		{
			ch.rectangle();
		}
		
		if(i==3)
		{
			System.out.println("\nenter the third unit:");
			ch.c=scan.nextInt();
			ch.volume();
		}
		System.out.println("\nbye");
	}
}
		
