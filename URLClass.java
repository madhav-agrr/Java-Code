import java.net.*;
import java.io.*;
public class URLClass{
	public static void main(String args[]){
		try{
			URL url=new URL("https://onlinecourses.nptel.ac.in/noc23_cs49/unit?unit=90&lesson=94");
			System.out.println("Protocol:"+url.getProtocol());
			System.out.println("Port no."+url.getPort());
			System.out.println("Host Name:"+url.getHost());
			System.out.println("File Name:"+url.getFile());
		}catch(Exception e){}
		
	}
}