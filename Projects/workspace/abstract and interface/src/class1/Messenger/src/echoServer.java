


import java.net.*;
import java.io.*;

public class echoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int portNumber = 9054 ;
		try (
		ServerSocket serverSocket=
		new ServerSocket ( 9054 ) ;
		Socket clientSocket = serverSocket.accept( );
		PrintWriter out =
		new PrintWriter ( clientSocket.getOutputStream( ),true);
		BufferedReader in = new BufferedReader (
		new InputStreamReader (clientSocket. getInputStream ( ) ) ) ;
		) {
		String inputLine ;
		while ( ( inputLine = in . readLine ( ) ) != null ) {
			System.out.println (inputLine);
			BufferedReader stdIn =new BufferedReader (
					new InputStreamReader ( System .in ) );
			String input=stdIn . readLine ( ) ;
			out . println ( input ) ;
		}
		} catch ( IOException e ) {

			System.out.println ( " Exception caught when trying to listen on port "
					+ portNumber + " or listening for a connection " ) ;
					System.out. println ( e . getMessage ( ) ) ;
					}
					}
		}


