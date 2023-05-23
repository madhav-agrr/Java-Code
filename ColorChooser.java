import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ColorChooser extends JFrame
implements ActionListener{
	JButton b;Container c;
	ColorChooser(){
	b=new JButton("Click Here");
	c=getContentPane();
	c.setLayout(new FlowLayout());
	b.addActionListener(this);
	c.add(b);}
	public void actionPerformed(ActionEvent e){
		Color initialcolor=Color.RED;
		Color color=JColorChooser.showDialog(this,"Select any Colour",initialcolor);
		c.setBackground(color);
	}
	public static void main(String args[]){
		ColorChooser ch=new ColorChooser();
		ch.setSize(600,400);
		ch.setVisible(true);
		ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}