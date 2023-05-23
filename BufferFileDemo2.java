//Buffer Input stream for reading from a file to program
import java.io.*;
public class BufferFileDemo2{
     public static void main (String args []) throws Exception{
     FileInputStream fin=new FileInputStream("bcd.txt");
         BufferedInputStream bin=new BufferedInputStream(fin);
          int i;
		  while((i=bin.read())!=-1){
		  System.out.print((char)i);
		  }
         bin.close();
         fin.close();
}
}