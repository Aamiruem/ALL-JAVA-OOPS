// package L02Updation;

/**
 * This class represents a student with name, roll number, and percentage.
 */
public class Updation {
    /**
     * A nested class representing a Student.
     */
    public static class Student {
        String name;
        int rno;
        double percent;

        /**
         * A method to display the name of the student.
         * 
         * @param x A reference to the student object.
         *          This method takes a student object and prints its name.
         */
        public static void fun(Student x) {
            System.out.println(x.name);
            return;
        }

        /**
         * A method to change the name of the student.
         * 
         * @param s A reference to the student object.
         *          This method takes a student object, modifies its name, and returns
         *          nothing.
         */
        public static void change(Student s) {
            s.name = "Aamir";
            return;
        }

        /**
         * The main method.
         * 
         * @param args Command line arguments.
         *             This method creates a Student object, initializes its properties,
         *             and prints its name before and after changing it.
         */
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "Aamir";
            s1.rno = 1;
            s1.percent = 95.6;
            System.out.println(s1.name);
            change(s1);
            System.out.println(s1.name);
        }
    }
}
