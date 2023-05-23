class Abc{
public static void main(String agrs[]){
int mark=5;
int grace=2;
int total=mark+(mark>6?++grace:--grace);
System.out.print(total);
}
}