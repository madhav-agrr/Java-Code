class Circle{
	double x,y;
	double r;
	double circumference(){
	return 2*3.14159*r;
	}
	double area(){
	return(22/7)*r*r;
	}
}
class Rectangle{
	double length;
	double bredth;
	double height;
	double volume(){
	return(length*bredth*height);
	}
	double area(){
	return(length*bredth+bredth*height+height*length)*2;
	}
}
class Demo3{
	public static void main(String args[]){
	Circle c1=new Circle();
	Rectangle r1=new Rectangle();
	c1.x=0.0;
	c1.y=0.0;
	c1.r=5.0;
	r1.length=3.0;
	r1.bredth=4.0;
	r1.height=5.0;
	System.out.println("Circumference"+c1.circumference());
	System.out.println("Area"+c1.area());
	System.out.println("Volume"+r1.volume());
	System.out.println("Area"+r1.area());
	}
}