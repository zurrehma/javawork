package upcastanddowncast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class lab5q7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("stuf.data");
		file.createNewFile();
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("stuf.data"));
		obj.writeInt(3);//Q7 part
		obj.writeInt(5);//Q7 part
		obj.writeDouble(6);//Q7 part
		obj.writeUTF("Name:zahid");//Q9 part
		obj.writeUTF("mail:zahid2015@namal.edu.pk");//Q9
		obj.writeUTF("Age:21");//Q9
		obj.close();
		ObjectInputStream objc=new ObjectInputStream(new FileInputStream("stuf.data"));
		System.out.println(objc.readInt());//Q8 part
		System.out.println(objc.readInt());//Q8 part
		System.out.println(objc.readDouble());//Q8 part
		System.out.println(objc.readUTF());//Q9 part
		System.out.println(objc.readUTF());//Q9 part
		System.out.println(objc.readUTF());//Q9 part
		
		objc.close();
	}

}
