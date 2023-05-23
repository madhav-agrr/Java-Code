import java.net.*;
public class Sender{
	public static void main(String args[])throws Exception{
		DatagramSocket ds=new DatagramSocket();
		String str="Wecome to Programming!";
		InetAddress ip=InetAddress.getByName("127.0.0.1");
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,4800);
		ds.send(dp);
		ds.close();
	}
}
