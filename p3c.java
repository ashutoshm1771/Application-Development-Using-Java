import java.awt.*;    
public class p3c   
{    
       p3c(){    
       Frame f= new Frame("CheckboxGroup Example");
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox cbg1 = new Checkbox("C++", cbg, false);    
        cbg1.setBounds(100,100, 50,50);    
        Checkbox cbg2 = new Checkbox("Java", cbg, true);    
        cbg2.setBounds(100,150, 50,50);    
        f.add(cbg1);    
        f.add(cbg2);    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
public static void main(String args[])    
{    
    new p3c();    
}    
}  