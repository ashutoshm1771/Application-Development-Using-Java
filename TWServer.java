import java.io.*;
import java.net.*;
public class twserver
{
public static void main(String[] args)
{
try
{
ServerSocket ss=new ServerSocket(2020);
Socket s=ss.accept();
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while(true)
{
str=br.readLine();
out.writeUTF(str);
str=in.readUTF();
System.out.println(str);
}
}
catch(Exception e)
{
}
}

}