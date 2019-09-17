import java.util.*;
class A extends Thread
{
public void run()
{
int i;
for(i=1;i<=5;i++)
{

System.out.println("\t from thread A:i"+i);
}


System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run(){
int j;
for(j=1;j<=5;j++)
{

System.out.println("\t from thread B:j"+j);
}


System.out.println("Exit from B");
}
}
class C extends Thread
{
public void run()
{
int k;
for(k=1;k<=5;k++)
{

System.out.println("\t from thread C:k"+k);
}


System.out.println("Exit from C");
}
}
class thread0
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();
a.setPriority(5);
b.setPriority(a.getPriority()+1);
c.setPriority(1);
a.start();
b.start();
c.start();
}
}