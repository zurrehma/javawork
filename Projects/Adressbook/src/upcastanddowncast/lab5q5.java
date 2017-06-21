package upcastanddowncast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab5q5 {
	public static void main(String[] args) throws IOException{
		String data="s";
		String data1="k";
		File file=new File("phonebook.txt");
		file.createNewFile();
		PrintWriter write=new PrintWriter("phonebook.txt");
		
		write.println(data+" "+data1);
		write.println("a"+" "+"k");
		//System.out.println(write.println(arg0););
		write.close();
		Scanner read=new Scanner(new FileInputStream("phonebook.txt"));
		System.out.println(read.nextLine());
		System.out.println(read.nextLine());
		read.close();
		
		
	}

}
