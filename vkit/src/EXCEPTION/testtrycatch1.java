package EXCEPTION;

public class testtrycatch1 {


public static void main(String args[])
{
	try
	{
int data=50/0; //may throw exception
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);	
	}
	finally
	{
		System.out.println("There is an Exception");
	}
System.out.println("rest of the code...");
}
}

