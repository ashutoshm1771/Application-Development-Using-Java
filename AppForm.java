import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AppForm extends JFrame implements ActionListener
{
	String str=" ";
	public AppForm()
	{
		JFrame f=new JFrame();
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(560,510);
		JTextField jtf1=new JTextField("Name");
		JLabel l1=new JLabel("<html>Name<br>Hello</html>");
		JLabel l2=new JLabel("Email-id");
		JTextField jtf2=new JTextField("Email-id");
		JLabel l3=new JLabel("Gender");
		JRadioButton jrb1=new JRadioButton("Male");
		JRadioButton jrb2=new JRadioButton("Female");
		jrb1.setBounds(75,50,100,30);
		jrb2.setBounds(75,100,100,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		f.add(l1);
		f.add(jtf1);
		f.add(l2);
		f.add(jtf2);
		f.add(l3);
		f.add(jrb1);
		f.add(jrb2);
		f.setVisible(true);
		Button submit=new Button("Submit");
		submit.addActionListener(this);
		f.add(submit);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(str.equals("submit"))
		{
			JFrame f=new JFrame();
			JLabel l4= new JLabel("submitted");
			f.add(l4);
		}
	}
	public static void main(String args[])
	{
		AppForm obj=new AppForm();
	}
}