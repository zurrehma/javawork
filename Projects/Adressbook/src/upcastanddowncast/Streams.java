package upcastanddowncast;
import java.io.*;

public class Streams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("myFile.txt");
		file.createNewFile();
		//file.exists();
//		file.isDirectory();
//		file.canWrite();
//		file.canExecute();
		PrintWriter writer=new PrintWriter("myFile.txt");
		writer.println(4);
		writer.println("line 1");
		writer.println("line 2");
		writer.close();
		BufferedReader read=new BufferedReader(new FileReader("myFile.txt"));
		int x=Integer.parseInt(read.readLine());
		
	System.out.println(x+4);
	
	read.close();
	}

}
