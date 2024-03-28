// package ALL-JAVA-OOPS.gettersAndSetters;


public class StudentClass {
    public static void change(Student s) {
        s.name = "Aamir";
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aamir";
        s.percent = 98;
        change(s);
        s.setRno(1);
        System.out.println(s.name);
    }
}
