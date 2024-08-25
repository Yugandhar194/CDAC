class Student {
	int id;
	String name;
	float marks;
	long mob;
	String address;
	static String instituteName = "CDAC Mumbai";
	
	Student(int a, String b, float c, long d, String e) {
		id = a;
		name = b;
		marks = c;
		mob = d;
		address = e;
		
	}
	
	float displayMarks() {
		
		return marks;
	}
	
	void calculatePercentage(){
		
		
		System.out.println("Percentage");
	
	
	}
	
	void displayDetails(){
		
		System.out.println(id+" "+name+" "+address+" "+mob+" "+marks);
	}
	
class StudentDemo{
	public static void main(String args[]) {
		System.out.println(Student.instituteName);
		
		Student so = new Student(1, "Yug", 70, 987654321L, "pune");
		System.out.println(so);
		//System.out.println(so.name);
		//System.out.println(so.instituteName);

	}
}
}