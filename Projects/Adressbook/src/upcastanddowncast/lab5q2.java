package upcastanddowncast;
//making copies of a file asking from user
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab5q2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("myFile1.txt");
		file.createNewFile();
		int noFiles=0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("how many files you want to create");
		noFiles=input.nextInt();
		input.nextLine();
		
		String name=" ";

		for(int i=0;i<noFiles;i++) {
			
				Scanner read1=new Scanner(new FileInputStream("myFile1.txt"));
				System.out.println("Enter name of first file");
				name=input.nextLine();
				String c="";
				File file1=new File(name);
				PrintWriter writer=new PrintWriter(file1);
					while(read1.hasNext())
						{
							c=read1.next();
							c=c+read1.nextLine();
							writer.println(c);
							//System.out.println(c);
							//x++;
						}
				writer.close();
				read1.close();
			}
		
	}

}
