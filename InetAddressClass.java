import java.net.*;
import java.io.*;
public class InetAddressClass{
	public static void main(String args[]){
		try{
			InetAddress ip=InetAddress.getByName("www.nptel.ac.in");
			System.out.print("Host Name:"+ip.getHostName());
			System.out.print("IP Address:" +ip.getHostAddress());
			}
		catch(Exception e){}
	}
}