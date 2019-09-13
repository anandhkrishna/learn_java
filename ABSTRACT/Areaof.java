import java.util.Scanner;
abstract class Shape
{
	int dim1,dim2;

	Shape(int a,int b)
	{
		dim1=a;
		dim2=b;
	}


	Shape(int a)
	{
		dim1=a;
	}

	abstract double area();
}

class Rectangle extends Shape
{
	Rectangle(int a,int b)
	{
		super(a,b);
	}

	double area()
	{
		System.out.println("The area of the rectangle is: ");
		return (double)(dim1*dim2);
	}
}

class Triangle extends Shape
{
	Triangle(int a,int b)
	{
		super(a,b);
	}

	double area()
	{
		System.out.println("The area of the triangle is: ");
		return (double)(dim1*dim2)/2;
	}
}
class Circle extends Shape
{


	Circle(int a)
	{
		super(a);
	}

	double area()
	{
		System.out.println("The area of the circle is: ");
		return (3.14*dim1*dim1);
	}
}

class Areaof
{
	public static void main(String args[])
	{
		Rectangle rec = new Rectangle(0,0);
		Triangle tri = new Triangle(0,0);
		Circle cir = new Circle(0);
		Shape shaperef;
		Scanner se = new Scanner(System.in);
		System.out.println("Enter the first dimension for rectangle: ");
		rec.dim1 = se.nextInt();
		System.out.println("Enter the second dimension for rectangle: ");
		rec.dim2=se.nextInt();
		System.out.println("Enter the first dimension for triangle: ");
		tri.dim1 = se.nextInt();
		System.out.println("Enter the second dimension for triangle: ");
		tri.dim2=se.nextInt();
		System.out.println("Enter the dimension for circle: ");
		cir.dim1 = se.nextInt();
		shaperef = rec;
		System.out.println(shaperef.area());
		shaperef = tri;

		System.out.println(shaperef.area());
		shaperef = cir;
		System.out.println(shaperef.area());
		se.close();
	}
}