package upcastanddowncast;
//counting the words in a file

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab5q4 {
	public static void main(String[] args) throws IOException {
		Scanner read=new Scanner(new FileInputStream("copy.txt"));
		
		int count=0;
		int count1=0;
		int anscount=0;
		String test ="";
		String test1 ="";
		
	while(read.hasNext()){
		test=read.next();
		//System.out.println(test);
		
//		for(int i=0;i<test.length();i++){
//			count=count+test.charAt(i);
//		}
		Scanner read1=new Scanner(new FileInputStream("copy1.txt"));
//			while(read1.hasNext()){////////////////////////first method problem is with .
//				//test1=read1.next();
//				test1=read1.findInLine(test);
//				//System.out.println(test);
//				for(int i=0;i<test1.length();i++){
//					count1=count1+test1.charAt(i);
//					
//				}
//				//System.out.println(count+"  "+count1);
//				if(count==count1){
//					anscount++;
//				}
//				count1=0;
//				
//			}
		while(read1.findInLine(test) != null){////////2nd method problem is with .
			anscount++;
		}
			read1.close();
			System.err.print(test);
			System.out.print(" repeated "+anscount+" times");
			System.out.println();
			anscount=0;
			//count=0;
		
		
	}
	read.close();
	
//	read.close();
	
//	read1.close();
}

	
}
