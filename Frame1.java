//frame,panel,button,checkbox,label,textfield,list,choice,scroll
//checkbox group checkboxes will be converted into radio buttons
//layout of the containers as Flow Layout,border Layout,Grid Layout
import java.awt.*;
public class Frame1{
public static void main(String args[]){
Frame frame=new Frame("Frame in Java");
frame.setSize(500,500);
frame.setBackground(Color.blue);


Choice c=new Choice();
//c.setBounds(300,390,75,75);
c.add("1");
c.add("2");
c.add("3");
c.add("4");
c.add("5");

Panel panel=new Panel();
//panel.resize(300,100);
//panel.setBackground(Color.yellow);

List l=new List(5);
//l.setBounds(300,300,75,75);
l.add("1");
l.add("2");
l.add("3");
l.add("4");
l.add("5");

TextField tx=new TextField("Wecome to Application programming");
//tx.setBounds(300,100,100,50);


TextArea ta=new TextArea("Wecome to Application programming");
//ta.setBounds(200,100,100,100);

Scrollbar sc=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
//sc.setBounds(100,50,300,50);
Scrollbar vc=new Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
//vc.setBounds(100,200,50,300);


Button b=new Button("Click me");
//b.setBounds(250,250,50,50);


Label l1=new Label("first");
//l1.setBounds(50,100,100,30);
Label l2=new Label("Second");
//l2.setBounds(50,120,100,30);


CheckboxGroup cbg=new CheckboxGroup();
Checkbox c1=new Checkbox("Hello",cbg,false);
//c1.setBounds(100,150,50,50);
Checkbox c2=new Checkbox("bye",cbg,true);
//c2.setBounds(100,200,50,50);

//frame.add(sc,BorderLayout.CENTER);
//frame.add(vc,BorderLayout.NORTH);
frame.add(panel);
frame.add(b);
//frame.add(l,BorderLayout.SOUTH);
//frame.add(tx,BorderLayout.WEST);
frame.add(ta);
frame.add(l1);
frame.add(l2);
frame.add(c1);
frame.add(c);
frame.add(c2);
frame.setLayout(new GridLayout(3,3));
//frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
//frame.setVisible(true);
frame.show();
}
}