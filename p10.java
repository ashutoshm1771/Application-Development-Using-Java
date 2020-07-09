// Author : Ashutosh Mishra

import java.awt.*;
import java.awt.event.*;
public class p10 implements ActionListener
{
Button b1,b2,b3,b4,b5;TextField t1,t2,t3;Label l1,l2,l3;
p10()
{
Frame f1=new Frame();
b1 =new Button("Add");
b2 =new Button("Sub");
b3 =new Button("Mul");
b4 =new Button("Div");
b5 =new Button("Exit");
l1=new Label("First Number");
l2=new Label("Second Number");
l3=new Label("Result");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
f1.setLayout(new GridLayout(6,2));
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(l3);
f1.add(t3);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);
f1.add(b5);
f1.setSize(600,200);
f1.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public static void main(String args[])
{
p10 t=new p10();
}
public void actionPerformed(ActionEvent e)
{
String s;
int val1,val2;
if(e.getActionCommand().equals("Add"))
{
val1=Integer.parseInt(t1.getText());
val2=Integer.parseInt(t2.getText());
t3.setText(String.valueOf(val1+val2));
}
if(e.getActionCommand().equals("Sub"))
{
val1=Integer.parseInt(t1.getText());
val2=Integer.parseInt(t2.getText());
t3.setText(String.valueOf(val1-val2));
}
if(e.getActionCommand().equals("Mul"))
{
val1=Integer.parseInt(t1.getText());
val2=Integer.parseInt(t2.getText());
t3.setText(String.valueOf(val1*val2));
}
if(e.getActionCommand().equals("Div"))
{
val1=Integer.parseInt(t1.getText());
val2=Integer.parseInt(t2.getText());
t3.setText(String.valueOf(val1/val2));
}
if(e.getActionCommand().equals("Exit"))
{
System.exit(0);
}
}
}
