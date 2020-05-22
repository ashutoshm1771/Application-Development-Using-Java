// Author : Ashutosh Mishra

import java.awt.*;  
public class p3g
{  
     p3g(){  
       Frame f= new Frame("Radio Button example");
        CheckboxGroup cbg=new CheckboxGroup();  
        Checkbox cbg1= new Checkbox("C++",cbg,false);  
        cbg1.setBounds(100,100, 50,50);  
        Checkbox cbg2= new Checkbox("Java",cbg,true);  
        cbg2.setBounds(100,150, 50,50);  
        f.add(cbg1);  
        f.add(cbg2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
{  
    new p3g();  
}  
}  
