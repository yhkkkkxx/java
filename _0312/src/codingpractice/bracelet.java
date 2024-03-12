package codingpractice;
import java.util.Scanner;

public class bracelet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int open=0, close=0;

        char[] bracelet = input.toCharArray();
        for(char b:bracelet) {
            if(b == '(') open++;
            else if(b == ')') close ++;
        }
        System.out.println(open+" "+close);
    }
}
