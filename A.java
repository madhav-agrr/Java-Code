class A{
public static void main(String a[]){
StringBuffer s=new StringBuffer("Java Programming");
int l=s.length();
System.out.println(s);
System.out.println(s.length());
s.insert(1,"java");
System.out.println(s);
s.replace(1,5,"Hello");
System.out.println(s);
int c=s.capacity();
System.out.println(c);
System.out.println(s.substring(0,7));
System.out.println(s.reverse());
try{
	int ab=10/0;
}catch(Exception e){System.out.println(e.getMessage());}
}
}