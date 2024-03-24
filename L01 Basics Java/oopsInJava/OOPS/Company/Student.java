package OOPS.Company;
public class Student {
    String name;
    private int roll;
    double precent;
    public int rollno;
    public int marks;
    public float percentage;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aamir";
        s1.roll = 1;
        s1.precent = 99.9;
        System.out.println(s1.name); // Aamir
        System.out.println(s1.roll); // 1
        System.out.println(s1.precent); // 99.9
    }
}
