import java.util.*;
class NASE
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]),i;
try{
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=i;
System.out.println("Array is : " +a[i]);
}
}
catch(NegativeArraySizeException e)
{
System.out.println("Pdap");
}
}
}