import javax.swing.*;
import java.awt.*;
public class JLabelDemo extends JFrame
{
	public JLabelDemo()
	{
		JFrame jfrm=new JFrame("JLabelDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(260,210);
		ImageIcon i1=new ImageIcon("Hourglass.png");
		JLabel j1=new JLabel("Hourglass",i1,JLabel.left);
		jfrm.add(j1);
		jfrm.setVisible(true);
		
	}
	public static void main(String args[])
	{
		JLabelDemo obj=new JLabelDemo();
	}
}