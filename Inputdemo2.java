import java.util.Scanner;
class Inputdemo2{
public static void main(String agrs[]){
Scanner scnr=new Scanner(System.in);
System.out.println("Please Enter two numbers");
int a=scnr.nextInt();
int b=scnr.nextInt();  //nextDouble() is used for double datatype
if(a>b){
System.out.printf("Between %d and %d,maximum is %d",a,b,a);
}
else{
System.out.printf("Between %d and %d,maximum is %d",a,b,b);
}
}
}