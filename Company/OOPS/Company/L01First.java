//package OOPS.Company;
//
//public class L01First {
//
//	public static void main(String[] args) {
//		Student s = new Student();
//		System.out.println("Hello World");
//	}
//}

package OOPS.Company;

public class L01First {
	String name;
	int rollno;
	int marks;
	int percentage;

	public static void main(String[] args) {
		Student x = new Student();
		x.name = "aamir";
		x.rollno = 1;
		x.marks = 100;
		x.percentage = 100;
		System.out.println("This is name: " + x.name);
		System.out.println("This is rollno: " + x.rollno);
		System.out.println("This is marks: " + x.marks);
		System.out.println("This is percentage: " + x.percentage);
		System.out.println("Hello World");
	}
}
