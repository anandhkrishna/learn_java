import java.io.File;
import java.nio.file.*;
import java.util.Scanner;
class FileHandlingg
{
	void fileExists(File file)
	{
		if(file.exists()) 
			System.out.println("The file exists!");
		else 
			System.out.println("The file doesn't exist!");


	}

	void fileReadable(File file)
	{
		if(file.exists()) 
		{
			if (file.canRead()) 
				System.out.println("The file is readable!");
			else 
				System.out.println("The file is not readable!");
		}
		else 
			System.out.println("The file doesn\'t exist!");
	}
	void fileWritable(File file)
	{
		if (file.exists()) 
		{
			if (file.canWrite()) 
				System.out.println("The file is writable!");
			else 
				System.out.println("The file not is writable!");
		}
		else System.out.println("The file doesn't exist!");
	}

	void fileType(File file) 
	{
		String fileString;
		if (file.exists()) 
		{
			fileString = file.getPath();
			String[] fileArray = fileString.split("[\\.]");
			System.out.println("The file is of " +"."+fileArray[fileArray.length-1]+" type");
		}
		else 
				System.out.println("The file doesn't exist!");
	}
	void fileLength(File file)
	{
		if (file.exists()) 
		{
			System.out.println("The length of the file in bytes: " + file.length());
		}
		else 
			System.out.println("The file doesn't exist!");
	}
}
public class FileHandler 
{
	public static void main(String[] args) 
	{
		String fileName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name along with its path: ");
		fileName = sc.next();
		Path path = Paths.get(fileName);
		System.out.println(path);
		File file = new File(path.toString());
		FileHandlingg fileHandling = new FileHandlingg();
		int ch;
		System.out.println("1.Check whether the file exists\n2.Check whether the filereadable\n3.Check whether the file is writable\n4.Check the type of the file\n5.Dispaly the length ofthe file\nEnter your choice: ");
		ch = sc.nextInt();
		switch(ch) 
		{
			case 1:
				fileHandling.fileExists(file);
				break;
			case 2:
				fileHandling.fileReadable(file);
				break;
			case 3:
				fileHandling.fileWritable(file);
				break;
			case 4:
				fileHandling.fileType(file);
				break;
			case 5:
				fileHandling.fileLength(file);
				break;
		}
	}
}