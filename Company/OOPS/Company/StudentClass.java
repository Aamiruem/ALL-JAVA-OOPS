//passing class to functions

//we have to declare the class outside of the main
//classes are passed by reference
// user defined data type

// constructor => constructor is a function that takes a parameter and returns a parameter. It's used for initializing objects with class

//parameter => parameter is a parameter that we pass into our function that takes a parameter



package OOPS.Company;

public class StudentClass {
	public static class Student{
		String name;
		int rollno;
		int marks;
		double percentage;
	}
//	creating a new data type
	public static void fun(Student s){
		System.out.println(s.name);
		System.out.println(s.rollno);
		System.out.println(s.marks);
		System.out.println(s.percentage);
		return;
	}

	public static void main (String[] args) {

		Student s = new Student();
		Student s1 = new Student();
		s.name = "Aamir";
		s.rollno = 1;
		s.marks = 500;
		s.percentage = 97.6;
		System.out.println (s.name );
		s1.name = "Kamran";
		System.out.println (s1.name );
		fun(s);


	}
}

