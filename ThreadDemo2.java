class ThreadA implements Runnable{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("From thread A with i="+ -1*i);
}
System.out.println("Exit A");
}
}
class ThreadB implements Runnable{
public void run(){
for(int j=1;j<=5;j++){
System.out.println("From thread B with j="+ 2*j);
System.out.println(Thread.currentThread().getId()); //to get the id of the current thread
}
System.out.println("Exit B");
}
}
class ThreadC implements Runnable{
public void run(){
for(int k=1;k<=5;k++){
System.out.println("From thread C with k="+ 2*(k-1));
}
System.out.println("Exit C");
}
}
public class ThreadDemo2{
public static void main(String args[]){
ThreadA a=new ThreadA();
Thread t1=new Thread(a);
ThreadB b=new ThreadB();
Thread t2=new Thread(b);
ThreadC c=new ThreadC();
Thread t3=new Thread(c);
t1.start();
t2.start();
t3.start();
System.out.println("Multithreading is over");
}
}