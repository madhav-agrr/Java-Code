import java.net.*;
import java.io.*;
public class URLConnectionClass{
	public static void main(String args[]){
		try{
			URL url=new URL("https://onlinecourses.nptel.ac.in/noc23_cs49/unit?unit=90&lesson=94");
			URLConnection uc=url.openConnection();
			InputStream s=uc.getInputStream();
			int i;
			while((i=s.read())!=-1){
			System.out.print((char)i);
			}
		}catch(Exception e){}
		
	}
}