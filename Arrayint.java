import java.util.Scanner;
class Arrayint
{
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		int i;
		int[]a= new int[10];
		for(i=0;i<10;i++)
		{
			a[i]=scan.nextInt();
		}
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
}
	