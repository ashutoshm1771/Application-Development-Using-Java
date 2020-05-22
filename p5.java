// Author : Ashutosh Mishra


import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
public class p5 extends Frame implements MouseListener
{
	Label l;
	p5()
	{
		addMouseListener(this);
		l=new Label();
		l.setBounds(20,50,100,120);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		l.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("Mouse Pressed");
	}
		public void mouseReleased(MouseEvent e)
	{
		l.setText("Mouse Released");
	}
	public static void main(String args[])
	{
		new p5();
	}
}
