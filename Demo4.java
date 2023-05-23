class Point
{
int x,y;
void setPoint(int a,int b){
	x=a;
	y=b;
	}
}
class Demo4{
public static void main(String args[]){
Point p=new Point();
p.setPoint(5,10);
System.out.println(p.x+p.y);
System.out.println(p.y);
}
}