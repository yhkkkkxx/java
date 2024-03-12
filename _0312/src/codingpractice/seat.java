package codingpractice;

import java.util.Arrays;
import java.util.Scanner;

public class seat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();

        String line = sc.nextLine();
        String[] heights = line.split(" ");
        int[] height = new int[n];

        for(int i=0; i<n; i++) height[i] = Integer.parseInt(heights[i]);
        Arrays.sort(height);

        for(int i=0; i<n; i++) {
            System.out.print(height[i]+" ");
            if((i+1)%c == 0) System.out.println("");
        }
    }
}
