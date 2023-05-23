//thread with priority

class ThreadA extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("From thread A with i="+ -1*i);
}
System.out.println("Exit A");
}
}
class ThreadB extends Thread{
public void run(){
for(int j=1;j<=5;j++){
System.out.println("From thread B with j="+ 2*j);
}
System.out.println("Exit B");
}
}
class ThreadC extends Thread{
public void run(){
for(int k=1;k<=5;k++){
System.out.println("From thread C with k="+ 2*(k-1));
}
System.out.println("Exit C");
}
}
public class ThreadDemo4{
public static void main(String args[]){
ThreadA x=new ThreadA();
ThreadB y=new ThreadB();
ThreadC z=new ThreadC();

z.setPriority(Thread.MAX_PRIORITY);
y.setPriority(y.getPriority()+1);
x.setPriority(Thread.MIN_PRIORITY);

x.start();
y.start();
z.start();
System.out.println("Multithreading is over");
}
}