//this keyword is used in all the successive constructors to indicate the constructor which has all the 3 parameters
class Circle{
	double x,y;
	double r;
	double circumference(){
	return 2*3.14159*r;
	}
	double area(){
	return(22/7)*r*r;
	}
Circle(double x,double y,double r){
this.x=x;
this.y=y;
this.r=r;
}
Circle(double r){
this(0.0,0.0,r);
}
Circle(Circle c){
this(c.x,c.y,c.r);
}
Circle(){
this(0.0,0.0,1.0);
}
}
class Thisdemo4{
	public static void main(String args[]){
	Circle c1=new Circle(3.0,4.0,5.0);
	Circle c2=new Circle(2.0);
	Circle c3=new Circle(c2);
	Circle c4=new Circle();
	System.out.println("Circumference"+c1.circumference());
	System.out.println("Area"+c1.area());
	System.out.println("Circumference"+c2.circumference());
	System.out.println("Area"+c2.area());
	System.out.println("Circumference"+c3.circumference());
	System.out.println("Area"+c3.area());
	System.out.println("Circumference"+c4.circumference());
	System.out.println("Area"+c4.area());
	}
}