import java.util.*;
public class Q4{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int length = sc.nextInt(); 
      // create an array to save user input 
      int[] name = new int[length];
      int sum=0;//save the total sum of the array.
//	  try{
  int i;
  for(i=0;i<name.length;i++){
  name[i]=sc.nextInt();
  }
  for(int j=0;j<name.length;j++){
 // System.out.println(name[j]);
  sum=name[j]+sum;
  }
 System.out.print(sum);
  }
//catch(Exception e){
//System.out.print("You entered bad data.");
}