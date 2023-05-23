//writing string,array of characters and one characters in a file

import java.io.FileOutputStream;
public class FileDemo1{
public static void main(String a[]){
byte cities[]={'H','E','L','L','O'};
String s="Hello Welcome to JAVA";
try{
FileOutputStream f=new FileOutputStream("abc.txt");
byte b[]=s.getBytes();
f.write(111);
f.write(cities);
f.write(b);
f.close();
System.out.println("File Writing is over......");
}catch(Exception e){
System.out.println(e);
System.exit(-1);
}
}
}