// Author : Ashutosh Mishra

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FlowLayoutDemo extends JFrame
{
	public FlowLayoutDemo()
	{
		this.setLayout(new FlowLayout());
		JLabel l1=new JLabel("Label 1");
		JLabel l2=new JLabel("Label 2");
		this.add(l1);
		this.add(l2);
		
	}
	public static void main(String args[])
	{
		FlowLayoutDemo f=new FlowLayoutDemo();
		f.setTitle("FlowLayout");
		f.setBounds(100,200,600,400);
		f.setVisible(true);
	}
}
