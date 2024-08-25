//Objects and Classes

class Laptop {
	int memory;
	String modelName;
	String processor;
	String os;
	float price;	//instance variable (declared inside class)
	
	void clickPhoto() {
		System.out.println("inside clickPhoto");
	}

	String typeNotepad() {
		return "Return from typeNotepad()";
	}
	
	void sound(){
		System.out.println("inside sound");	
	}
}
public class Demo {
	public static void main (String args[]) {
			int a = 10; //primitive DT & local variable
			
			Laptop lo = new Laptop();
			//new - keywoed, to allocate memory
			// lo - refernce of object
			lo.sound();		//sound method is called
			String s = lo.typeNotepad();
			System.out.println(s);
	}
}
//Objects are stored in heap area.