import java.awt.*;
public class p7
{
Button b1,b2,b3,b4,b5;
p7()
{
Frame f1=new Frame();
b1=new Button("North");
b2=new Button("West");
b3=new Button("South");
b4=new Button("East");
b5=new Button("Center");
f1.setLayout(new BorderLayout(5,2));
b1.setBackground(Color.red);
f1.add(b1,"North");
b2.setBackground(Color.cyan);
f1.add(b2,"West");
b3.setBackground(Color.pink);
f1.add(b3,"South");
b4.setBackground(Color.blue);
f1.add(b4,"East");
b5.setBackground(Color.green);
f1.add(b5,"Center"); 
f1.setSize(300,600);
f1.setVisible(true);
}
public static void main(String args[])
{
p7 b=new p7();
}
}
