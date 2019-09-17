import java.awt.*;
import java.applet.*;
/*
<applet code="Rectangles" width=300 height=200>
</applet>
*/

public class Lines extends Applet 
{
	public void init()
	{
		setBackground (Color.black);
		setForeground(Color.green);
	}

	public void paint(Graphics g) 
	{
		g.drawLine(0, 0, 100, 100);
		g.drawLine(0, 100, 100, 0);
		g.drawLine(40, 25, 250, 180);
		g.drawLine(75, 90, 400, 400);
		g.drawLine(20, 150, 400, 40); //line
		g.drawLine(5, 290, 80, 19); //line
		g.drawLine (5, 75, 5, 75); // point
		g.drawLine (50, 5, 50, 5); // point
	}
}