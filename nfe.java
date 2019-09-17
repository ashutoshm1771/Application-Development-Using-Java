import java.util.*;
class nfe
{
	public static void main(String args[])
	{
		int a,b;
		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.valueOf(args[1]);
			int c=a+b;
			System.out.println("C="+c);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NFE");
		}
	}
}