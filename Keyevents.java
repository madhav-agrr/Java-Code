import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Keyevents extends Applet implements KeyListener{
	String msg="";int x=10,y=20;
	public void init(){
		addKeyListener(this);requestFocus();
	}
	public void keyPressed(KeyEvent ke){
		showStatus("Key Down");
	}
	public void keyReleased(KeyEvent ke){
		showStatus("Key up");
	}
	public void keyTyped(KeyEvent ke){
		msg+=ke.getKeyChar();repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,x,y);
	}
}
/*
<applet code="Keyevents.java" height=500 width=500>
</applet>
*/