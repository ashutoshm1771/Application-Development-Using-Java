// Author : Ashutosh Mishra

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class InnerDemo extends Frame
{
	String msg=" ";
	public InnerDemo()
	{
		addMouseListener(new MyMouseAdapter());
		addMouseMotionListener(new MyMouseAdapter());
		addWindowListener(new MyWindowAdapter());
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
	public static void main(String args[])
	{
		InnerDemo obj=new InnerDemo();
		obj.setSize(new Dimension(300,300));
		obj.setTitle("AdapterDemo");
		obj.setVisible(true);
	}
class MyMouseAdapter extends MouseAdapter
{
	public void mouseClicked(MouseEvent e)
	{
		msg="mouseClicked";
		repaint();
	}
}
}
class MyWindowAdapter extends WindowAdapter
{
	public void WindowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
