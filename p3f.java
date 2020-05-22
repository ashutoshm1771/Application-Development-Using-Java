// Author : Ashutosh Mishra

import java.awt.*;  
public class p3f 
{  
     p3f(){  
        Frame f= new Frame("TextArea Example");  
            TextArea area=new TextArea("Welcome to java");  
        area.setBounds(10,30, 300,300);  
        f.add(area);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
{  
   new p3f();  
}  
} 
