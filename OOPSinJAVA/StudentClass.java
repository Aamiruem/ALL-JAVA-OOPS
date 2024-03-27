// package OOPS.Company;

public class StudentClass {
    class Student {
        String name;
        int age;
        int roll_no;
        double percentage;
        float fees;
    }

    public static void fun(Student x) {
        System.out.println(x.name);

        return;
    }

    private String name;
    private int age;
    private int roll_no;
    private double percentage;
    private int fees;

    // creating a new data type
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass();
        s1.name = "Aamir";
        s1.age = 18;
        s1.roll_no = 1;
        s1.percentage = 99.9;
        s1.fees = 1000;

        System.out.println("Name : " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Roll No: " + s1.roll_no);
        System.out.println("Percentage : " + s1.percentage);
        System.out.println("Fees : " + s1.fees);
    }
}
