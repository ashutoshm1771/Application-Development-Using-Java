// Author : Ashutosh Mishra

import java.applet.Applet;  
import java.awt.*;  
 /*<applet code="graphics" width="300" height="300">  
</applet>*/ 
public class graphics extends Applet{  
  
public void paint(Graphics g){  
g.setColor(Color.red);  
g.drawString("Welcome",50, 50);  
g.drawLine(20,30,20,300);  
g.drawRect(70,100,30,30);  
g.fillRect(10,100,30,30);  
g.drawOval(70,200,30,30);  
  
g.setColor(Color.pink);  
g.fillOval(170,200,30,30);  
g.drawArc(90,10,30,30);  
g.fillArc(20,10,30,30);  
  
