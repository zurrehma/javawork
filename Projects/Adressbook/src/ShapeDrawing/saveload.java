package ShapeDrawing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class saveload extends MyPanel {
	File save =new File("savedata.dat");
	public saveload(){
		System.out.println("yes");
		create();
		save();
	}
	public void create(){
		System.out.println("create");
		
		try {
			save.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void save(){
		System.out.println("yes save");
//		PrintWriter writer=new PrintWriter(save);
//		writer.println("1");
//		for(Shape s: shapes){
//			System.out.println(s);
//		writer.print(s);
//		writer.close();
//		}
//		writer.close();
//	}
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(save));
			System.out.println("o");
			for(Shape s: shapes){
				outputStream.writeObject(s);
			}
			outputStream.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}



