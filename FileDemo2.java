import java.io.FileInputStream;
public class FileDemo2{
public static void main(String args[]){
try{
FileInputStream f=new FileInputStream("abc.txt");
//int i=f.read(); //read 1 character at a time..pointing to 1st char of the file. Return as ASCII value of the character.
int i=0;
while((i=f.read())!=-1){ //for all characters of the file
System.out.print((char)i);}
f.close();
}catch(Exception e){
System.out.println(e);
}
}
}