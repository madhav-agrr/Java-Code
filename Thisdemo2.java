// calling m function and n function together by only creating 1 obj of n function
class A{
void m(){System.out.println("Hello m");}
void n(){
System.out.println("hello n");
this.m();
}
}
class Thisdemo2{
public static void main(String args[]){
A a=new A();
a.n();
}
}