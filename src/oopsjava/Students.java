// package ALL-JAVA-OOPS.src.oopsjava;

// Java Class Attributes
// Class Student{ Final Keyword In Java -
// String name;
// int Roll_no;
// String address;
// }
// Main(){
// Student std1 = new Student();
// std1.name = "Rahul”;
// std1.Roll_no = 11;
// std1.address = "XYZ Colony India"
// }
public class Students {
    final String name = "kamran";
    int roll_No;
    String address;

    public class demo {

    }
    public static void main(String[] args) {
        Students s = new Students();
        System.out.println(s.name);
    }
}
