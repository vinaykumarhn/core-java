package vkit;
abstract class Bank1
{
	abstract float getRateOfInterest();
	void display()
	{
		System.out.println("Abstract class");
	}
}
class SBI1 extends Bank1
{
	@Override
	float getRateOfIntrest()
	{
		return 7.0f;
		
	}
}
class HDFC1 extends Bank1
{
	@Override
	float getRateOfIntrest()
	{
		return 6.8f;
		
	}
}
class ICICI1 extends Bank1
{
	@Override
	float getRateOfIntrest()
	{
		return 6.9f;
		
	}
}

public class abstractiondemo {
	public static void main(Strings[] args)
	{
		HDFC h1=new HDFC1();
		System.out.println("Rate Of Interest HDFC is "+h1.getRateOfInterest());
		h1.display();
		Bank1 s = new ICICI();
		s.display();
		System.out.println("Rate Of Interest ICICI is"+s.getRateOfInterest());
	}

}
