import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class scribble1 extends Applet implements MouseListener,MouseMotionListener{
		private int last_x,last_y;
		public void init(){
			this.addMouseListener(this);
			this.addMouseMotionListener(this);
		}
		public void mousePressed(MouseEvent e){
			last_x=e.getX();
			last_y=e.getY();
		}
		public void mouseDragged(MouseEvent e){
			Graphics g=this.getGraphics();
			int x=e.getX(),y=e.getY();
			g.drawLine(last_x,last_y,x,y);
			last_x=x;last_y=y;
		}
		public void mouseClicked(MouseEvent e){showStatus("Mouse clicked!!");}
		public void mouseEntered(MouseEvent e){}
		public void mouseMoved(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
	}

/*
<applet code="scribble1.java" height=500 width=400></applet>
*/