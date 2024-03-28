// package OOPSinJAVA;

// Access Modifiers
// 1) Public - all packages
// 2) Private - same class
// 3) Default - same package

public class Student {

    String name;
    int rollNo;
    double percent;

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Kamran";

        System.out.println(s.name);
    }
}
