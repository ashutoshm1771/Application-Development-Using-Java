// Author : Ashutosh Mishra

import java.util.*;
class samp
{
	void display()
	{
		System.out.println("HELLO");
	}
}
class npe
{
	public static void main(String args[])
	{
		samp s=null;
		try
		{
			s.display();
		}
		catch(NullPointerException e)
		{
			System.out.println("NPE");
		}
	}
}
