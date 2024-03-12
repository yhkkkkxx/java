package codingpractice;
import java.util.Scanner;

public class albacheonguk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        boolean alba = false;
        boolean days[] = {true, false, true, false, true, false, true};

        if(days[day-1]) System.out.println("oh my god~");
        else System.out.println("enjoy!");
    }

}
