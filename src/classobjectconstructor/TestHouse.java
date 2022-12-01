package classobjectconstructor;

//runnable class
class TestHouse {

	public static void main(String[] args) {
		
		House myHouse = new House();
		myHouse.room();
		
		House yourHouse = new House("white");
		yourHouse.room();
		
		House hisHouse = new House("red", 5);
		hisHouse.room();

	}

}
