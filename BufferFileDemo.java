//Buffer Output stream for writing into a file from program
import java.io.*;
public class BufferFileDemo{
     public static void main (String args []) throws Exception{
     FileOutputStream fout=new FileOutputStream("bcd.txt");
         BufferedOutputStream bout=new BufferedOutputStream(fout);
          String s="Welcome to NPTEL";
          byte b[]=s.getBytes();
         bout.write(b);
         bout.flush();
         bout.close();
         fout.close();
         System.out.println ("success");
}
}