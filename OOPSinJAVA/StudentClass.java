// package OOPS.Company;
/* State True or False 1)OOPS refer to using objects in programming.2)Class is user defined blueprint through which objects are created.3)Objects of same
    class have
    different properties/attributes.4)
    Objects are
    instance of class */

    
public class StudentClass {
    public static class Student {
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

        Student s = new Student();// This is thse declaration of the student type data to store data
        // s is the object
        s.name = "Aamir";
        s.percentage = 99.9;
        s.roll_no = 1;

        System.out.println("Name : " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Roll No: " + s1.roll_no);
        System.out.println("Percentage : " + s1.percentage);
        System.out.println("Fees : " + s1.fees);
    }
}
