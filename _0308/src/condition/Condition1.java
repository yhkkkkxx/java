package condition;

public class Condition1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("start...");
        System.out.println("connect...");
        if(a < 20) {
            System.out.println("disconnect...");
            System.out.println("end...");
            return;
        }
        System.out.println("database and impl...");
        System.out.println("disconnect...");
        System.out.println("end...");
    }
}
