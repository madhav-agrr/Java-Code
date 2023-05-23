//Frame,button,button icon,label,Event,text field,password,checkbox,radio button,button group using Swing

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrameExample{
public static void main(String args[]){
JFrame frame=new JFrame("jframe example");
JPanel panel=new JPanel();
panel.setLayout(new FlowLayout());
panel.setBackground(Color.blue);
JLabel label=new JLabel("Example");
JButton button=new JButton("click");
button.setBounds(20,20,80,30);
JButton b=new JButton(new ImageIcon("C:\\Users\\admin\\Desktop\\img.png"));
JCheckBox c=new JCheckBox("C++");
JCheckBox c1=new JCheckBox("Java",true);
JRadioButton r=new JRadioButton("Male");
JRadioButton r1=new JRadioButton("Female");
ButtonGroup rg=new ButtonGroup();

SpinnerModel value=new SpinnerNumberModel(5,0,10,1);
JSpinner spinner=new JSpinner(value);
spinner.setBounds(100,100,50,30);
panel.add(spinner);


rg.add(r);rg.add(r1);
panel.add(r);panel.add(r1);
//button.setText("Button");
JTextField tf=new JTextField();
final JPasswordField pwd=new JPasswordField();
pwd.setBounds(20,150,200,50);
tf.setBounds(200,300,150,150);
button.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	tf.setText("Welcome!!");
	}
});
panel.add(c);
panel.add(c1);
//panel.setLayout(null);
panel.add(label);
panel.add(b);
panel.add(pwd);
panel.add(button);
panel.add(tf);
frame.add(panel);
frame.setSize(500,500);
//frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}