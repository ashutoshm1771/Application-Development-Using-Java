//Author : Ashutosh Mishra

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BorderLayoutDemo extends JFrame{
	public BorderLayoutDemo()
	{
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout());
		p.add(new JButton("North"),BorderLayout.NORTH);
		p.add(new JButton("South"),BorderLayout.SOUTH);
		p.add(new JButton("East"),BorderLayout.EAST);
		add(p);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new BorderLayoutDemo();
	}
}
