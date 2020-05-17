// Author : Ashutosh Mishra

import java.awt.*;
import java.applet.*;
/*<applet code="p1" width=400 height=200> <param name="string" value="applet"> </applet>*/
public class p1 extends Applet
{
 String str;
 public void init()
 {
   str=getParameter("string");
   if(str==null)
     str="java";
   str="hello "+str;
 }
 public void paint(Graphics g)
 {
   g.drawString(str,10,100);
 }
}
