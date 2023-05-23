import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame implements ActionListener{
static JFrame f;
static JTextField l;
String s0,s1,s2;
Calculator(){
s0=s1=s2="";
}
public static void main(String args[]){
f=new JFrame("Swing Calculator");
try{
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
catch(Exception e){
System.out.println(e.getMessage());
}
Calculator c=new Calculator();
l=new JTextField(16);
l.setEditable(false);
JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bd,bm,be,beg,beg1;
b0=new JButton("0");
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
beg1=new JButton("=");
ba=new JButton("+");
bs=new JButton("-");
bd=new JButton("/");
bm=new JButton("*");
beg=new JButton("C");
be=new JButton(".");
JPanel p=new JPanel();
bm.addActionListener(c);
bd.addActionListener(c);
bs.addActionListener(c);
ba.addActionListener(c);
b9.addActionListener(c);
b8.addActionListener(c);
b7.addActionListener(c);
b6.addActionListener(c);
b5.addActionListener(c);
b4.addActionListener(c);
b3.addActionListener(c);
b2.addActionListener(c);
b1.addActionListener(c);
b0.addActionListener(c);
be.addActionListener(c);
beg.addActionListener(c);
beg1.addActionListener(c);
p.add(l);
p.add(ba);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(bs);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(bm);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(bd);
p.add(be);
p.add(b0);
p.add(beg);
p.add(beg1);
//Set background of Panel
p.setBackground(Color.blue);
//add panel to frame
f.add(p);
f.setSize(200,220);
f.show();
}
public void actionPerformed(ActionEvent e){
String s=e.getActionCommand();
System.out.println(s);
//if the value is a number
	if((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0)== '.'){
		//if operator is present then add to 2nd number
		if(!s1.equals(""))
			s2=s2+s;
		else
			s0=s0+s;
			//set the value of text
			l.setText(s0+s1+s2);
		}
	else if(s.charAt(0)=='C'){
		//clear the one letter
		s0=s1=s2="";
		//set the value of text
		l.setText(s0+s1+s2);
	}
	else if(s.charAt(0)=='='){
		double te;
		//store the value is 1st
		if(s1.equals("+"))
			te=(Double.parseDouble(s0)+Double.parseDouble(s2));
		else if(s1.equals("-"))
			te=(Double.parseDouble(s0)-Double.parseDouble(s2));
		else if(s1.equals("*"))
			te=(Double.parseDouble(s0)*Double.parseDouble(s2));
		else
			te=(Double.parseDouble(s0)/Double.parseDouble(s2));
		//set the value of text
		l.setText(s0+s1+s2+"="+te);
		s1=s2="";
	}
	else{
		//if there is no operand
		if(s1.equals("") || s2.equals(""))
		s1=s;
	//else evaluate
		else{
			double te;
			//store the value in 1st
		if(s1.equals("+"))
			te=(Double.parseDouble(s0)+Double.parseDouble(s2));
		else if(s1.equals("-"))
			te=(Double.parseDouble(s0)-Double.parseDouble(s2));
		else if(s1.equals("*"))
			te=(Double.parseDouble(s0)*Double.parseDouble(s2));
		else
			te=(Double.parseDouble(s0)/Double.parseDouble(s2));
		//convert it to string
		s0=Double.toString(te);
		//place the operator
		s1=s;
		//place the operand blank
		s2="";
		}
l.setText(s0+s1+s2);
}
}
}