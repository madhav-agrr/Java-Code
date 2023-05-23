import java.awt.*;
import java.applet.*;
public class Applet2 extends Applet implements Runnable{
  String msg="A Simple Moving Banner.";
  Thread t=null;
   int state;
  boolean stopFlag;
   // Set colors and initialize thread.
  public void init(){
     setBackground(Color.cyan);
     setForeground(Color.red);
   }
   // Start thread
  public void start(){
     t=new Thread(this);
     stopFlag=false;
     t.start();
   }
   // Entry point for the thread that runs the banner.
  public void run(){
     char ch;
     // Display banner
     for( ; ; ){
       try{
         repaint();
        Thread.sleep(250);
         ch=msg.charAt(0);
         msg=msg.substring(1,msg.length());
           msg+=ch;
		   if(stopFlag)
		   break;
		   }
		   catch(InterruptedException e){ }
		   }
		 }
		 //Pause the banner
		 public void stop(){
		 stopFlag=true;
		 t=null;
		 }
		 //Display banner
		 public void paint(Graphics g){
		 g.drawString(msg,50,30);
		 } 
		 }
		 
/*<html>
<body><applet code="Applet2.class" height="200" width="200">
</applet></body></html>*/
