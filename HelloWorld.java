import java.applet.Applet;
import java.awt.Graphics;
public class HelloWorld extends Applet{
	public void paint(Graphics g){
		g.drawString("Hello World !!",150,150);
	}
}
/*<html>
	<body>
		<applet code="HelloWorld.class" width="300" height="300">
		</applet>
	</body>
</html>*/