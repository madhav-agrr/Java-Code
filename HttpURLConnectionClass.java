import java.net.*;
import java.io.*;
public class HttpURLConnectionClass{
	public static void main(String args[]){
		try{
			URL url=new URL("https://onlinecourses.nptel.ac.in/noc23_cs49/unit?unit=90&lesson=94");
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();
			int i;
			for(i=1;i<=8;i++){
			System.out.print(huc.getHeaderFieldKey(i)+" "+huc.getHeaderField(i));
			}
			huc.disconnect();
		}catch(Exception e){}
		
	}
}