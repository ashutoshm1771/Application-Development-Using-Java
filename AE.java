import java.util.*;
class AE
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.valueOf(args[1]);
try
{
int c=a/b;
System.out.println("C="+c);
}
catch(ArithmeticException e)
{
System.out.println("Division be zero");
}
finally
{
System.out.println("hjfhiusg");
}
}
}