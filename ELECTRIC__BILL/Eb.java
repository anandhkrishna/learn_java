import java.util.Scanner;
class Elecbill
{
	public int conno;
	public String conname;
	public float pmr,cmr,s;
	void unit()
	{
		s=cmr-pmr;
	}
	void domestic()
	{
		if(s<=100)
			System.out.println("your bills is"+s*1);
		else if(s>=101 && s <=200)
			System.out.println("your bill is"+s*2.50);
		else if(s>=201 &&  s<=500)
			System.out.println("your bill is "+s*4);     
		else 
			System.out.println("your bill is"+s*6);
	}
	void commercial()
	{
		if(s<=100)
			System.out.println("your bill is"+s*2);
		else if(s>=101 && s<=200)
			System.out.println("your bill is"+s*4.50);
		else if(s>=201 && s<=500)		
			System.out.println("your bill is"+s*6);
		else 
			System.out.println("your bill is"+s*7);
	}
	void condetails()
	{
		System.out.println("consumer member"+conno);
		System.out.println("consumer name-"+conname);
	}
}
class Eb
{
	public static void main(String args[])
	{
		Elecbill bill =new Elecbill();
		Scanner ch=new Scanner(System.in);
		System.out.println("\nenter the name:");
		bill.conname=ch.nextLine();
		System.out.println("\n enter the number");
		bill.conno=ch.nextInt();
		System.out.println("\n enter the cur.month readings:");
		bill.cmr=ch.nextFloat();
		System.out.println("\n enter the prev.month readings:");
		bill.pmr=ch.nextFloat();
		bill.condetails();
		bill.unit();
		int i=bill.conno;
		if(i<=5 )
			bill.domestic();
		else
			bill.commercial();
	}
}