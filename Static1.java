public class Static1{
  static int circlecount=0; // class variable
  public double x,y,r; // instance variables
  public Static1(double x,double y,double r){
    this.x=x;this.y=y;this.r=r;
  }
	public Static1(double r){
     this (0.0,0.0,r);
     circlecount++;
  }
	public Static1(Static1 s){
    this(s.x,s.y,s.r);
     circlecount++;
	 }
	public Static1(){
     this(0.0,0.0,0.1);
     circlecount++;
	 }
	public double circumference(){
    return (2*3.14159*r);
	}
	public double area(){
      return (3.14159*r*r);
	  }
	public static void main(String args[]){
Static1 s1=new Static1();
System.out.println("s1#"+ s1.circlecount);
Static1 s2=new Static1(5.0);
System.out.println("s2#"+ s2.circlecount);
Static1 s3=new Static1(s1);
System.out.println("s3#"+ s3.circlecount);
System.out.println("s1#"+s1.circlecount + " s2#"+s2.circlecount+" s3#"+ s3.circlecount);
}
}

