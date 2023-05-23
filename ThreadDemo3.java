//yield(),sleep(),stop() method with threads

class ThreadA extends Thread{
public void run(){
System.out.println("Start thread A...");
for(int i=1;i<=5;i++){
if(i==1)yield();
System.out.println("From Thread A:i="+i);
}
System.out.println("Exit A");
}
}
class ThreadB extends Thread{
public void run(){
System.out.println("Start thread B...");
for(int j=1;j<=5;j++){
if(j==2)stop();
}
System.out.println("Exit B");
}
}
class ThreadC extends Thread{
public void run(){
System.out.println("Start thread C...");
for(int k=1;k<=5;k++){
if(k==3){
try{
sleep(10000);
}
catch(Exception e){}
}
}
System.out.println("Exit C");
}
}
public class ThreadDemo3{
public static void main(String args[]){
ThreadA a=new ThreadA();
ThreadB b=new ThreadB();
ThreadC c=new ThreadC();
a.start();
b.start();
c.start();
System.out.println("Multithreading is over");
}
}