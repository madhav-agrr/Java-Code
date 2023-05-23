import java.applet.*;
import java.awt.*;
public class Applet1 extends Applet{
String msg;
public void init(){
setBackground(Color.cyan);
setForeground(Color.red);
msg="Iniside init()--";
}
public void start(){
msg+="Iniside start()--";
}
public void paint(Graphics g){
msg+="Inside paint()--";
g.drawString(msg,10,30);
}
}