package vkit;

public class Box {
	//class variables
	private double dblWidth=3.4;
	private double dblHeight=2.2;
	private double dblDepth=4;
	//static variables
	private static int boxid;
	public double calcVolume() {
		//local variable
		double dblTemp;
		dblTemp= dblWidth* dblHeight* dblDepth;
		return dblTemp;
	}
	
public static void main(String args[])
{
	Box b1=new Box();
	System.out.println("volume of the box is" +b1.calcVolume());
	
}
	

}
