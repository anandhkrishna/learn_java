class Dispoverload
{
	public void Disp(char c)
	{	
		System.out.println(c);
	}
	public void Disp(int c)
	{
		System.out.println(c);
	}
}
class Funoverloead
{
	public static void main(String args[])
	{
		Dispoverload scan=new Dispoverload();
		scan.Disp('a');
		scan.Disp(5);
	}
}