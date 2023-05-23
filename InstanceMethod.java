//Example of static method
//A class method and instance method

public class InstanceMethod{
     public double x,y,r;
      static int circlecount=0;
     public InstanceMethod(double x, double y, double r){
       this.x=x; this.y=y;this.r=r;
       //circlecount++;
	 }
    public InstanceMethod(double r){
       this(0.0,0.0,r);
       circlecount++;
	   }
    public InstanceMethod(InstanceMethod c){
       this(c.x,c.y,c.r);
       circlecount++;
	   }
    public InstanceMethod(){
       this(0.0,0.0,0.1);
        circlecount++;
		}
      // An instance method. Return the bigger of two
     public InstanceMethod bigger (InstanceMethod c){
        if(c.r > r) return c;
        else return this;
		}
// A class method: Return the bigger of two classes.
public static InstanceMethod bigger (InstanceMethod a, InstanceMethod b){
    if(a.r > b.r) return a;
    else return b;
 }
public static void main (String args[]){
    InstanceMethod a = new InstanceMethod(2.0);
    InstanceMethod b = new InstanceMethod(3.0);
    InstanceMethod c = a.bigger(b);
    InstanceMethod d = InstanceMethod.bigger(a,b);
}
}