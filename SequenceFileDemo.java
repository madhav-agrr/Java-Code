//Sequence Input Stream to merge contents of 2 files
import java.io.*;
class SequenceFileDemo{
    public static void main (String args []) throws Exception{
         FileInputStream input1=new FileInputStream ("abc.txt");
         FileInputStream input2=new FileInputStream ("bcd.txt");
        SequenceInputStream inst=new SequenceInputStream(input1,input2);
         int j;
        while((j=inst.read())!=-1){
            System.out.print ((char)j);
         }
        inst.close();
        input1.close();
        input2.close();
}}