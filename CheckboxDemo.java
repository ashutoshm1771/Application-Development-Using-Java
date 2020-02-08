// Author : Ashutosh Mishra

import java.awt.*;
import java.awt.event.*;
public class CheckboxDemo extends Frame implements ItemListener
{
   String msg=" ";
   Checkbox windows,android,mac,solarsis;
   public CheckboxDemo()
   {
     setLayout(new FlowLayout());
     windows=new Checkbox("windows"); 
     android=new Checkbox("android");
     mac=new Checkbox("mac");
     solarsis=new Checkbox("solarsis");
     add(windows);
     add(android);
     add(mac);
     add(solarsis);
     windows.addItemListener(this);
     android.addItemListener(this);
     mac.addItemListener(this);
     solarsis.addItemListener(this);
     addWindowListener(new WindowAdapter()
     {
       public void windowClosing(WindowEvent we)
       {
         System.exit(0);
       }
     });
    }
    public void itemStateChanged(ItemEvent ie)
    {
      repaint();
    }
    public void paint(Graphics g)
    {
       msg="current state:";
       g.drawString(msg,20,120);
       msg="windows:"+windows.getState();
       g.drawString(msg,20,140);
       msg="android:"+android.getState();
       g.drawString(msg,20,160);
       msg="mac:"+mac.getState();
       g.drawString(msg,20,180);
       msg="solarsis:"+solarsis.getState();
       g.drawString(msg,20,200);
    }
     public static void main(String args[])
     {
      CheckboxDemo obj=new CheckboxDemo();
      obj.setSize(new Dimension(600,600));
      obj.setTitle("Checkbox Demo");
      obj.setVisible(true);
     }
}
