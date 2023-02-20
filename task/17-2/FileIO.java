package task17_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO 
{
	public static void main(String[] args) throws IOException 
	{
		String s1 = new String("Hello from avadh...");
		
		FileOutputStream fout = new FileOutputStream("G:// avadh.txt");
		fout.write(s1.getBytes());
		System.out.println("success");

	}
}
