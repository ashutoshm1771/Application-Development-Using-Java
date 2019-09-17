import java.util.*;
class vector1
{
public static void main(String args[])
{
Vector v=new Vector(5);
v.addElement(1);
v.addElement(1.5);
v.addElement('5');
v.insertElementAt("hi",2);
System.out.println(v);
}
}