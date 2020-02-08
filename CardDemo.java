// Author : Ashutosh Mishra

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardDemo extends JFrame implements ActionListener
{
	CardLayout card;
	Container c;
	CardDemo()
	{
		 card=new CardLayout(40,30);
		 c=getContentPane();
		c.setLayout(card);
		JButton b1=new JButton("Hello");
		JButton b2=new JButton("World");
		JButton b3=new JButton("By Ashu");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		c.add("a",b1);
		c.add("b",b2);
		c.add("c",b3);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		card.next(c);
	}
	public static void main(String args[])
	{
		CardDemo cd=new CardDemo();
		cd.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cd.setSize(300,300);
		cd.setVisible(true);
	}
}
