import java.util.Scanner;
public class w9{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int arr[][]=new int[5][5];
for(int i=0;i<5;i++){
  for(int j=0;j<5;j++){
arr[i][j]=sc.nextInt();
  }
}
for(int i=0;i<5;i++){
  for(int j=0;j<5;j++){
    if(arr[i][j]==0){
    arr[i][j]=1;
    }
    else if(arr[i][j]==1){
    arr[i][j]=0;
    }
    else{
    System.out.print("Enter valid input");
    }
  }
}
for(int i=0;i<5;i++){
  for(int j=0;j<5;j++){
    System.out.print(arr[i][j]);
  }
}
}
}