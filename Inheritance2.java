//Inheritance example:initializing through constructor
class Box{
 double width;
 double height;
 double depth;
 Box (){         // Default setting by this constructor
     width=0.0;
     height=0.0;
     depth=0.0;
     }
 Box (double w, double h, double d) {
     width=w;
     height=h;
     depth=d;
 }
 double volume(){// compute and return volume
     return width*height*depth;
 }
 }
//Here, Box is extended to include weight.
class BoxWeight extends Box {
 double weight; // weight of box
 // constructor for BoxWeight
 BoxWeight (double w, double h, double d, double m){
	width = w;
	height = h;
	depth = d;
	weight = m;
	}}
	class Inheritance2{
		public static void main (String largs []) {
			Box mybox1 =new Box();
			BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
			double vol;
			vol=mybox1.volume();
			System.out.println ("Volume of mybox1 is" + vol);
			System.out.println();
			
			vol=mybox2.volume();
			System.out.println ("Volume of mybox2 is" + vol);
			System.out.println("Weight of mybox2 is"+ mybox2.weight);
			}
		}
