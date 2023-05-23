import java.util.Scanner;
class Triangle{
public static void main(String agrs[]){
int arr[][]=new int[5][5];
Scanner sc=new Scanner(System.in);
/*for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print("*"+"\t");
}
System.out.println();
}*/
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
	System.out.printf("Enter arr[%d][%d]element of array",i,j);
	arr[i][j]=sc.nextInt();
/*if(i>j){
System.out.print("*"+"\t");
}
else{
System.out.print("\t");
}}
System.out.println("\n");*/
}
}
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
	System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
}
}