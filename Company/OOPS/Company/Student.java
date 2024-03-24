//oops => object-oriented programming language is not available yet for this language in java
//class is a blueprint for creating objects
//object is an instance of a class

package OOPS.Company;

public class Student {
	// This is the constructor for the class
	String name;
	int rollno;
	int marks;
	float percentage;

	public static void main(String[] args) {
		// x is the object of the class
		Student x = new Student();
		x.name = "aamir";
		x.rollno = 1;
		x.marks = 500;
		x.percentage = 97.6f;
		System.out.println("This is name: " + x.name);
		System.out.println("This is rollno: " + x.rollno);
		System.out.println("This is marks: " + x.marks);
		System.out.println("This is percentage: " + x.percentage + 8 + "%");
		System.out.println("Hello World");
	}
}
