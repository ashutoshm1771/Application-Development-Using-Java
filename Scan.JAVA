import java.io.*;
import java.util.Scanner;
public class Scan
{
public static void main(String args[]) throws IOException
{
if(args.length>0)
{
Scanner s=null;
try
{
s=new Scanner(new FileReader(args[0]));
while(s.hasNext())
{
System.out.println(s.next());
}
}
finally
{
if(s!=null)
s.close();
}
}
else
{
System.out.println("JAVA SCAN FILE NAME IS NOT FOUND");
}
}
}