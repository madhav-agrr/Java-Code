//table,list,scrollpane,combo box,option pane,menu bar,popup menu,checkbox menu item,progress bar,tree
//tabbed panel,jslider
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class FrameExample2{
public static void main(String args[]){
	int i=0;
JFrame frame=new JFrame("jframe example 2");
frame.setLayout(new FlowLayout());
String county[]={"India","Aus","Europe","America"};
String data[][]={{"101","Madhav","670"},{"","Amit","190"},{"103","Rahul","4700"}};
String column[]={"ID","NAME","Salary"};
JComboBox cb=new JComboBox(county);
JTable jt=new JTable(data,column);
JScrollPane sp=new JScrollPane(jt);
JList list=new JList(county);
JOptionPane.showMessageDialog(frame,"HELLO!!");


JMenuBar mb=new JMenuBar();
JMenu menu=new JMenu("Menu");
JMenu submenu=new JMenu("SubMenu");
JMenuItem i1=new JMenuItem("Item 1");
JMenuItem i2=new JMenuItem("Item 2");
JMenuItem i3=new JMenuItem("Item 3");


JCheckBoxMenuItem ci=new JCheckBoxMenuItem("Item4");
menu.add(i1);menu.add(i2);submenu.add(i3);submenu.add(ci);
menu.add(submenu);mb.add(menu);

JProgressBar pb=new JProgressBar(0,2000);
//pb.setVisible(true);
pb.setStringPainted(true);
	
JPopupMenu pm=new JPopupMenu("EDIT");
JMenuItem cut=new JMenuItem("cut");
JMenuItem copy=new JMenuItem("copy");
JMenuItem paste=new JMenuItem("paste");
pm.add(cut);pm.add(copy);pm.add(paste);
frame.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e){
		pm.show(frame,e.getX(),e.getY());
	}
});

JSlider js=new JSlider(JSlider.HORIZONTAL,0,50,25);


TextArea ta=new TextArea();
JPanel p1=new JPanel();
p1.add(ta);
JPanel p2=new JPanel();
JTabbedPane tp=new JTabbedPane();
tp.add("main",p1);
tp.add("help",p2);

DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
DefaultMutableTreeNode color=new DefaultMutableTreeNode("Color");
DefaultMutableTreeNode font=new DefaultMutableTreeNode("Font");
DefaultMutableTreeNode red=new DefaultMutableTreeNode("Red");
DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Blue");
DefaultMutableTreeNode black=new DefaultMutableTreeNode("Black");
color.add(red);color.add(blue);style.add(font);style.add(color);
JTree j=new JTree(style);

frame.add(js);
frame.add(tp);
frame.add(j);
frame.add(pb);
frame.add(pm);
frame.add(list);
frame.add(mb);
frame.add(cb);
frame.add(sp);
frame.add(jt);
frame.setVisible(true);
frame.setSize(300,300);
while(i<=2000){
		pb.setValue(i);
		i=i+20;
	try{Thread.sleep(150);
	}catch(Exception e){}
	}
}}