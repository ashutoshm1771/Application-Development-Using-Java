import java.awt.*;  
public class p3h  
{  
      p3h(){  
        Frame f= new Frame("Listbox Example");  
        List l1=new List(5);  
        l1.setBounds(100,100, 75,75);  
        l1.add("CSE");  
        l1.add("IT");  
        l1.add("EEE");  
        l1.add("ECE");  
        l1.add("CVIL");  
        f.add(l1);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
{  
   new p3h();  
}  
} 