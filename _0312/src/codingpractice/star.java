package codingpractice;
import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n/2+1; i++) {
            for(int j=n/2-i; j>=0; j--) System.out.print(" ");
            for(int j=1; j<=2*i-1; j++) System.out.print("*");
            System.out.println("");
        }
    }
}
