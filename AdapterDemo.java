//Author : Ashutosh Mishra

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AdapterDemo extends Frame
{
	String msg=" ";
	public AdapterDemo()
	{
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseAdapter(this));
		addWindowListener(new MyWindowAdapter(this));
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
	public static void main(String args[])
	{
		AdapterDemo obj=new AdapterDemo();
		obj.setSize(new Dimension(300,300));
		obj.setTitle("AdapterDemo");
		obj.setVisible(true);
	}
}
class MyMouseAdapter extends MouseAdapter
{
	AdapterDemo ad;
	public MyMouseAdapter(AdapterDemo ad)
	{
		this.ad=ad;
	}
	public void mouseClicked(MouseEvent e)
	{
		ad.msg="mouseClicked";
		ad.repaint();
	}
}
class MyWindowAdapter extends WindowAdapter
{
	AdapterDemo ad;
	public MyWindowAdapter(AdapterDemo ad)
	{
		this.ad=ad;
	}
	public void WindowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
