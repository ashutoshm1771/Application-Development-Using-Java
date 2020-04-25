// Author : Ashutosh Mishra

import java.awt.*;
import javax.swing.*;
public class JLabelDemo
{
	public JLabelDemo()
	{
		JFrame jfrm=new JFrame("J Label Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(260,210);
		ImageIcon il=new ImageIcon("HourGlass.jpg");
                JLabel j1=new JLabel("hourglass",il,JLabel.CENTER);
		jfrm.add(j1);
		jfrm.setVisible(true);
	}
	public static void main(String args[])
	{
		JLabelDemo a=new JLabelDemo();
	}
}
