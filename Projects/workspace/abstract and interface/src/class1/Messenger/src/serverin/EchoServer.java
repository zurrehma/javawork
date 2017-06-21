package serverin;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class EchoServer {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args)throws IOException {
//		if (args.length !=1){
//			System.err.println("Usage:_java_EchoServer_<portNumber>");
//			System.exit(1);
//		}
		int portNumber=8090;
		try(
				ServerSocket serverSocket=new ServerSocket(portNumber);
				Socket clientSocket=serverSocket.accept();
				PrintWriter out=new PrintWriter(clientSocket.getOutputStream(),true);
				BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				)
		{
			String inputLine;
			while ((inputLine=in.readLine())!= null)
			{
//				out.println("Munnawar"+inputLine);
				
				System.out.println("A:  "+inputLine);
				String output;
				System.out.print("Type: ");
				output=input.nextLine();
				out.println(output);
				
			}
		}
		
		catch(IOException e){
			System.out.println("Exception_caught_when_trying_listen_on_port"+portNumber+"_or_listening_for_a_connection");
			System.out.println(e.getMessage());
		}
				

	}

}
