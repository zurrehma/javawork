package upcastanddowncast;
//q1:counting words in a file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("myFile1.txt");
		file.createNewFile();
		int x=0; 
		
		PrintWriter writer=new PrintWriter("myfile1.txt");
		writer.println("how many files you want to create");
		writer.println("how many files you want to create");
		writer.close();
		Scanner read1=new Scanner(new FileInputStream("myFile1.txt"));
		while(read1.hasNext()){
			read1.next();
			x++;
		}
		
		read1.close();
		System.out.println(x+ "  words");
		}
		
	}


