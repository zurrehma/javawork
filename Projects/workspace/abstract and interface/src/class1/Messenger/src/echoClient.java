

import java.net.*;
import java.io.*;
public class echoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String hostName="172.16.11.186";
		int portNumber = 9054 ;
		try (
		Socket echoSocket=
		new Socket ( hostName,portNumber ) ;
		PrintWriter out =
		new PrintWriter ( echoSocket.getOutputStream( ),true);
		BufferedReader in = new BufferedReader (
		new InputStreamReader (echoSocket. getInputStream ( ) ) ) ;
				BufferedReader stdIn =
						new BufferedReader (
						new InputStreamReader ( System .in ) )
		) {
		String userInput ;
		String name = "zahid";
		while ( ( userInput = stdIn . readLine ( ) ) != null ) {
			out . println ( name +" "+userInput ) ;
			System .out . println (   in . readLine ( ) ) ;
			}
			} catch ( UnknownHostException e ) {
			System . err . println ( "Don’t know about host " + hostName ) ;
			System . exit ( 1 ) ;
			} catch ( IOException e ) {
				System . err . println ( " Couldn’t get I/O for the connection to " +
						hostName ) ;
						System . exit ( 1 ) ;
						}
		}
}

