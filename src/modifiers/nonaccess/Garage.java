package modifiers.nonaccess;

public class Garage {

	//non access modifier: final
	//restricts reassignment for variables
	
	static int width;
	static int length;
	
	//static method uses only static variables 
	public static void driveWayWidth() {
		width = 10;
		//length = 12;
		System.out.println("driveway width");
	}
	
	//non static method uses both static and non static variables 
	public void driveWayLength() {
		width = 10;
		length = 12;
		System.out.println("driveway length");
	}
	
	//setter
	public void setLength(int myLength) {
		length = myLength;
	}
	//getter
	public int getLength() {
		return length;
	}	
	
	//static attributes belong t the class
	//non static attributes belong to the object
}
