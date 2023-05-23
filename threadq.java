public class threadq{
public static void main(String args[]){
Thread thread=Thread.currentThread();
thread.run();
System.out.print(thread.activeCount());
}
}