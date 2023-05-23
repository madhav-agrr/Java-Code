//Copying File using Byte Stream Classes
import java.io.*;
class FileDemo5{
    public static void main (String args[]){
        //Declare and create input and output files
         FileInputStream infile=null;
        FileOutputStream outfile=null;
		byte byteRead;
		try{
        infile=new FileInputStream("input.txt");
        outfile=new FileOutputStream("output.txt");
		byteRead=(byte)infile.read();
        while(byteRead!=-1){
                outfile.write(byteRead);
				byteRead=(byte)infile.read();
			}
		 }catch(Exception e){
            System.out.println(e);
            System.exit(-1);
         }finally{       //Close files
             try{
                infile.close();
                outfile.close();
             }
            catch(IOException e){}
			}
			}
			}
