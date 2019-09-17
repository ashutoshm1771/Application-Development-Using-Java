import java.util.*;
import java.io.*;
class Longvector
{
public static void main(String args[])
{
Vector list=new Vector();
int length=args.length;
int i;
for(i=0;i<length;i++)
{
list.addElement(args[i]);
}
list.insertElementAt("c++",0);
int size=list.size();
String[] arr=new String[size];
list.copyInto(arr);
System.out.println("list of languages= ");
for(i=0;i<size;i++)
System.out.println(arr[i]);
}
}