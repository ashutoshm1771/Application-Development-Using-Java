import java.net.URL;
import java.io.*;
public class split
{

  public static void main(String args[]) {
try
{

    URL u = new URL("http://www.java2s.com:80/index.html");

    

    System.out.println("Protocol"+ u.getProtocol());
    System.out.println("Host" + u.getHost());
    System.out.println("Port number" + u.getPort());
    System.out.println("FileName" + u.getFile());
   //System.out.println("Exit" + utogetExternalForm());

 }
   catch(Exception e)
{
 System.out.println(e);
}
}
}
