import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class InnerDemo1 extends Frame
{
	String msg=" ";
	public InnerDemo1()
	{
		addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	addMouseListener(new MouseAdapter()
	{
		public void MouseEntered(MouseEvent e)
		{
			msg="Mouse Extend";
			repaint();
		}
	});
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,40,40);
	}
	public static void main(String args[])
	{
		InnerDemo1 obj=new InnerDemo1();
		obj.setSize(new Dimension(300,300));
		obj.setTitle("InnerDemo");
		obj.setVisible(true);
	}
	
}