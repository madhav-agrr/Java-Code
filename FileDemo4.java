//Copying File using Character Stream Classes
import java.io.*;
class FileDemo4{
    public static void main (String args[]){
        //Declare and create input and output files
         File inFile=new File("input.txt");
        File outFile=new File("output.txt");
        FileReader ins=null; // Creates file stream ins
        FileWriter outs=null;
        // Creates file stream outs
         try{
             ins=new FileReader(inFile);
            //Opens inFile
            outs=new FileWriter(outFile);
             //Opens outFile
             int ch; // Read and write till the end
            while((ch=ins.read())!=-1){
                outs.write(ch);
			}
		 }catch(IOException e){
            System.out.println(e);
            System.exit(-1);
         }finally{       //Close files
             try{
                ins.close();
                outs.close();
             }
            catch(IOException e){}
			}
			}
			}
