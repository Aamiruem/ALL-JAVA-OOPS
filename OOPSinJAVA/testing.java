// package OOPSinJAVA;

public class testing {

    //creating a new data type
    public static void change(Student s) {
        s.name = "Aamir";

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aamir";
        change(s1);
        System.out.println(s1.name);
    }
}
