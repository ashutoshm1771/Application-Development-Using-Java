import java.awt.*;
import java.awt.event.*;
public class ButtonDemo extends Frame implements ActionListener
{
	public ButtonDemo()
	{
		setLayout(new FlowLayout());
		Button red=new Button("red");
		Button blue=new Button("blue");
		Button yellow=new Button("yellow");
		add(red);
		add(blue);
		add(yellow);
		red.addActionListener(this);
		blue.addActionListener(this);
		yellow.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("red"))
		{	
			setBackground(Color.red);
		}
		else if(str.equals("blue"))
		{		
			setBackground(Color.blue);
		}
		else
		{	
			setBackground(Color.yellow);
		}
		
	}
	public static void main(String args[])
	{
		ButtonDemo obj=new ButtonDemo();
		obj.setSize(new Dimension(300,300));
		obj.setTitle("ButtonDemo");
		obj.setVisible(true);
	}
	
}