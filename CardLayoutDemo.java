import java.awt.*;
import java.awt.event.*;
public class CardLayoutDemo extends Frame
{
   Checkbox CSE,IT,ECE,MECHANICAL,CIVIL,EEE,HOUSING,
   Button srkr,vishnu;
   Panel CollegeCards;
   CardLayout cardlo;
   public CardLayoutDemo()
   {
     setLayout(new FlowLayout());
     srkr=new Button("SRKR"); 
     vishnu=new Button("VISHNU"); 
     add(srkr);
     add(vishnu);
     cardlo=new CardLayout();
     CollegeCards=new Panel();
     add(t1,BorderLayout.CENTER);
     addWindowListener(new WindowAdapter()
     {
       public void windowClosing(WindowEvent we)
       {
         System.exit(0);
       }
     });
    }
     public static void main(String args[])
     {
      BorderLayoutDemo obj=new BorderLayoutDemo();
      obj.setSize(new Dimension(300,300));
      obj.setTitle("Border Layout Demo");
      obj.setVisible(true);
     }
}