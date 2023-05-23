import javax.swing.*;
public class JSwingProgressBar extends JFrame{
int i=0;
JProgressBar pb;
JSwingProgressBar(){
pb=new JProgressBar(0,2000);
pb.setStringPainted(true);
pb.setBounds(40,40,160,30);
pb.setValue(0);
add(pb);
setLayout(null);
setSize(250,150);
}
public void iterate(){
	while(i<=2000){
		pb.setValue(i);
		i=i+20;
	try{Thread.sleep(20);
	}catch(Exception e){}
}}
public static void main(String args[]){
JSwingProgressBar b=new JSwingProgressBar();
b.setVisible(true);
b.iterate();
}
}