import java.awt.*;
public class CardLayout1 extends java.applet.Applet{
CardLayout layout;
public void init(){
layout=new CardLayout();
setLayout(layout);
add("1",new Button("Card 1"));
add("2",new Button("Card 2"));
add("3",new Button("Card 2"));
add("4",new Button("Card 3"));
add("5",new Button("Card 4"));
}
public boolean keyDown(Event e,int key){
layout.previous(this);
return(true);
}
}
/*
<applet code="CardLayout1.class" height=300
width=300></applet>
*/