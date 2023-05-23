public class threadq2 extends Thread{
public void run(){
for(int i=1;i<5;i++){
System.out.println(++i);
}
}
public static void main(String args[]){
threadq2 t1=new threadq2();
t1.run();
}
}