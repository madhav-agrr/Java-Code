import java.util.*;
public class Question5{  
    public static void main(String[] args) { 
	    String s1="NPTELJAVA"; 
            Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
            char c='a';
			int word[]=new int[10];
for(int i=0;i<s1.length();i++){
word[i]= s1.charAt(i);
}
word[n]=c;
for(int i=0;i<s1.length();i++){
System.out.print((char)word[i]);
}
}}