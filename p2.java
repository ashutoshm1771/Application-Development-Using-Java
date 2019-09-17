import java.awt.*;
import java.applet.*;
/*<applet code="p2" width=200 height=200> </applet>*/
public class p2 extends Applet
{
 TextField t1,t2;
 public void init()
 {
   t1=new TextField(8);
   t2=new TextField(8);
   add(t1);
   add(t2);
 }
 public void paint(Graphics g)
 {
   int x=10,y=20,z=0;
   String s1,s2,s;
   g.drawString("Input a number in each box ",10,50);
   try {
    s1=t1.getText();
    x=Integer.parseInt(s1);
    s2=t2.getText();
    y=Integer.parseInt(s2);
   }
   catch(Exception e) {  }
   z=x+y;
   s=String.valueOf(z);
   g.drawString("the sum is :",10,75);
   g.drawString(s,100,75);
 }
 public Boolean actionPerformed(Event event,Object object)
 {
   repaint();
   return true;
 }
}