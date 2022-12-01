package modifiers.nonaccess;

public class TestGarage {

	public static void main(String[] args) {
		
		//I could call static attributes without creating object because static attributes belong to the class
		Garage.driveWayWidth();
		Garage.width = 12;
		
		Garage myGarage = new Garage();
		myGarage.setLength(12);
		System.out.println(myGarage.getLength());
		
		Garage yourGarage = new Garage();
		yourGarage.setLength(14);
		System.out.println(yourGarage.getLength());
		
		System.out.println(myGarage.getLength());

	}

}
