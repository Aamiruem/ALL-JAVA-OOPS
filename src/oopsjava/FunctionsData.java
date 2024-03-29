// package ALL-JAVA-OOPS.src.oopsjava;

public class FunctionsData {
    String name;
    int roll_no;

    public void printData() {
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        FunctionsData obj = new FunctionsData();
        obj.name = "Kamran";
        obj.roll_no = 123456;
        obj.printData();

        FunctionsData s = new FunctionsData();
        s.name = "Afroz";
        s.roll_no = 12;
        s.printData();
    }
}
