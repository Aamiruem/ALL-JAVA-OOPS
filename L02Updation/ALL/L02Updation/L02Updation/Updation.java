
public class Updation {
    public static class Student {
        String name;
        int rno;
        double percent;
    }

    public static void fun(Student x) {
        System.out.println(x.name);
        return;
    }

    public static void change(int x) {
        x = 7;
        return;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aamir";
        s1.rno = 1;
        s1.percent = 95.6;
        System.out.println(s1.name);
        // change(s1);
    }
}
