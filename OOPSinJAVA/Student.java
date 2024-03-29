// package OOPSinJAVA;

// Access Modifiers
// 1) Public - all packages
// 2) Private - same class
// 3) Default - same package

public class Student {

    static String name;
    static int rollNo;
    static double percent;

    public Student(String name, int rollNo, double percent) {
        Student.name = name;
        Student.rollNo = rollNo;
        Student.percent = percent;

    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Student s = new Student(name, rollNo, percent);
        Student.name = "Kamran";

        System.out.println(Student.name);
    }
}
