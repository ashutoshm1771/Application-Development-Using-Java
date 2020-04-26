// Author : Ashutosh Mishra

class UDE extends Exception
{
	UDE(String msg)
	{
		super(msg);
	}
}
class userdefex
{
	public static void main(String args[])
	{
		int age=Integer.parseInt(args[0]);
		try
		{
			if(age>18)
				System.out.println("eligible to vote");
			else
				throw new UDE("Not eligible");
		}
		catch(UDE e)
		{
			System.out.println("Exception");
			System.out.println(e);
		}
		finally
		{
			System.out.println("Hello");
		}
	}
}
