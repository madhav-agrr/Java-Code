import java.io.*;
class InputStreamDemo{
public static void main(String args[]){
double principalAmount=0.0;
double rateofInterest=0.0;
int numberofYears=0;
try{
DataInputStream in=new DataInputStream(System.in);
String tempString;
System.out.println("Enter Principal Amount");
System.out.flush();
tempString=in.readLine();
principalAmount=Float.valueOf(tempString);
System.out.println("Enter Rate of Interest");
System.out.flush();
tempString=in.readLine();
rateofInterest=Float.valueOf(tempString);
System.out.println("Enter Number of Years");
System.out.flush();
tempString=in.readLine();
numberofYears=Integer.parseInt(tempString);
}catch(Exception e){
System.out.println("Exception:"+ e.getMessage());
}
double InterestTotal=principalAmount*rateofInterest*numberofYears;
System.out.println("Total Income=" +InterestTotal);
}
}