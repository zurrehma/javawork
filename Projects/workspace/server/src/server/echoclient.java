package server;
import java.net.*;
import java.io.*;
public class echoclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String hostName="172.16.0.1";
		int portNumber = 7654 ;
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
		while ( ( userInput = stdIn . readLine ( ) ) != null ) {
			out . println ( userInput ) ;
			System .out . println ( " echo : " + in . readLine ( ) ) ;
			}
			} catch ( UnknownHostException e ) {
			System . err . println ( "Don ’ t know about ho st " + hostName ) ;
			System . exit ( 1 ) ;
			} catch ( IOException e ) {
				System . err . println ( " Couldn’t get I/O for the connection to " +
						hostName ) ;
						System . exit ( 1 ) ;
						}
		}
}

