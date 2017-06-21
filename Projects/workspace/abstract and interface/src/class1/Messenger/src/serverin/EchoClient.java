package serverin;

import java.io.*;
import java.net.*;
public class EchoClient {
	public static void main(String []args)
	{
//	throws IOException {
//		if (args.length !=2){
//			System.err.println("Usage:_java_EchoClient_<host_name>_<port_number");
//			System.exit(1);
//		}
	String hostName="172.16.11.186";
	int portNumber=8090;
	try(
		Socket echoSocket=new Socket(hostName,portNumber);
		PrintWriter out=new PrintWriter(echoSocket.getOutputStream(),true);
		BufferedReader  in=new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		BufferedReader stdln=new BufferedReader(new InputStreamReader(System.in));
				
	)
	{
		String userInput;
		while ((userInput=stdln.readLine())!=null){
			out.println(userInput);
			System.out.println("echo :_"+in.readLine());
		}
	}
	catch (UnknownHostException e){
		System.err.println("DON't know about host"+hostName );
		System.exit(1);
	}catch (IOException e){
		System.err.println("could not get I/O for the connection to"+hostName);
		System.exit(1);
	}
}
}
