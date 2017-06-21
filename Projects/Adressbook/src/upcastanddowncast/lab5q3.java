package upcastanddowncast;
//appending two files in a new file

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab5q3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("copy.txt");
		file.createNewFile();
		File file1=new File("copy1.txt");
		file1.createNewFile();
		PrintWriter write=new PrintWriter(("merge.txt"));
		//write.println("my name is zahid i am preasent in copy file");
		Scanner read=new Scanner(new FileInputStream("copy.txt"));
		Scanner read1=new Scanner(new FileInputStream("copy1.txt"));
			while(read.hasNext())
				{
					write.println(read.nextLine());
				
				}
			//write.close();
			read.close();
			while(read1.hasNext())
			{
				write.println(read1.nextLine());
			
			}
			write.close();
			read1.close();

	}

}
