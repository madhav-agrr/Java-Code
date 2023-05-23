class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
		super.Print();
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
super.Print();		
        System.out.println("This is small");
    }
}
class Main{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
    }
}