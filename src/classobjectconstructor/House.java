package classobjectconstructor;

//blueprint
public class House {

	//attributes
	
	//variables
	int length;
	int width;
	
	//constructor: block of code similar to method called implicitly during the creation of the object
	//default constructor
	public House(){
		
	}
	//built constructor
	House(String houseColor){
		System.out.println(houseColor);
	}
	House(String houseColor, int numberOfRooms){
		System.out.println(houseColor+" "+numberOfRooms);
	}
	
	//methods
	public void room() {
		System.out.println("sleep zzzzzzzzzzzzzzzzzzz");
	}
	
	void bathRoom() {
		System.out.println("shower shower lalalalala");
	}
	
	void kitchen() {
		System.out.println("yummy yummy");
	}
	
	void livingRoom() {
		System.out.println("watch tv");
	}
	
	
}
