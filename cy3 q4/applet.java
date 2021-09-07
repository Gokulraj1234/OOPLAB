import java.awt.*;
import java.applet.*;
public class applet extends Applet
{
public void paint(Graphics g)
{
	g.drawOval(25,205,100,50);
	g.setColor(Color.yellow);
	g.fillOval(25, 205, 100, 50);
	g.setColor(Color.red);
	g.fillRoundRect(25,125,100,50,15,15);
	g.setColor(Color.pink);
	g.fillRect(100, 300, 300, 100);
	int xPoints[] = {250,320,170,250};
	int yPoints[] = {100,150,150,100};
	g.setColor(Color.blue);
	g.fillPolygon(xPoints, yPoints, 4);
}
}
/*<applet code = "applet" height = 500 width =500>
</applet> */