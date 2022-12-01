package modifiers.access;

class Animal {

	//access modifiers: private, protected, default, public
	//private: allows attributes within the same class only
	//protected: coming soon
	//default: allows access within the same package
	//public: allows access from outside package (anywhere)
	//class can be public or default only
	
	//variable
	private int numberOfLegs = 2;
	
	//constructor
	private Animal(){
		
	}
	
	//methods
	private void color() {
		System.out.println("brown");
	}
}
