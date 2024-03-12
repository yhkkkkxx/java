package codingpractice;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sn = 0;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                sn += j;
            }
        }
        System.out.println(sn);
    }
}
