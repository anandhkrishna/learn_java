import java.util.*;
class Stringops
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		String s1,s2,s3;
		int loc,sizE,i;
		char a;
		al.add("Java");
		System.out.println("Array list before string operations: " +al);
		Scanner se = new Scanner(System.in);
		System.out.println("Enter the string to be appended: ");
		s1 = se.nextLine();
		al.add(s1);
		System.out.println("Array list after appending: " +al);
		System.out.println("Enter the string to be inserted: ");
		s2 = se.nextLine();
		System.out.println("Enter the position: ");
		loc = se.nextInt();
		al.add(loc,s2);
		System.out.println("Array list after insertion: " +al);


		System.out.println("Enter the string to be searched: ");
		s3 = se.next();
		System.out.println("The position of the searched string: " +al.indexOf(s3));

		sizE = al.size();
		System.out.println("Enter the element: ");
		a = se.next().charAt(0);
		String[] arr = new String[al.size()];
		for(i=0;i<sizE;i++)
		{
			arr[i] = al.get(i);
				if(arr[i].charAt(0)==a) 
					System.out.println(arr[i]+"\n");
		}
		se.close();
	}
}