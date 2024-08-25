//Objects and Classes

class Laptop {
	int memory;
	String modelName;
	String processor;
	String os;
	float price;
	
	void clickPhoto() {
		System.out.println("inside clickPhoto");
	}

	void typeNotepad() {
		return "Return from typeNotepad()";
	}
	
	void sound(){
		System.out.println("inside sound");	
	}
}
public class Demo {
	public static void main (String args[]) {
			int a = 10;
			Laptop lo = new Laptop();
			lo.sound();
			String s = lo.typeNotepad();
			System.out.println(s);
	}
}