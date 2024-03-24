//State True or False
//		1) OOPS refer to using objects in programming.
//		2) Class is user defined blueprint through which
//		objects are created.
//		2) Object is an instance of a class.
//		3) Objects of the same class have different
//		attributes. => Same class can have different attributes but different objects can have same attributes in same class.

//		properties => properties are attributes of an object.
//
//		4) Objects are instance of class.

// Arrays => Array is a collection of similar type of objects.
//Classes => classes are blueprints for creating objects.

package OOPS.Company;

public class Objects {

	String name;
	int rollno;
	int marks;
	float percentage;

	public static class Car {
		String name;
		String type;
		int price;

	}

	public static void main(String[] args) {
		Car car = new Car();
		car.name = "BMW";
		car.type = "SUV";
		car.price = 100000;
		System.out.println(car.name);
		System.out.println(car.type);
		System.out.println(car.price);

		// SUV => SELF POWERED VEHICLE

		// OOPS.Company.Scanner sc = new OOPS.Company.Scanner(System.in);
		// int z = sc.nextInt();
		// OOPS.Company.Student s1 = new OOPS.Company.Student(); //declared an object in
		// the class
		// object is s1
		// s1.name = "aamir";
		// s1.rollno = 1;
		// s1.marks = 500;
		// s1.percentage = 97.6f;
		// System.out.println("This is name: " + s1.name);
		// System.out.println("This is rollno: " + s1.rollno);
		// System.out.println("This is marks: "+ s1.marks);
		// System.out.println("This is percentage: " + s1.percentage + 8+ "%");
		// System.out.println("Hello World");
	}
}
