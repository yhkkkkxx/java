package codingpractice;

import java.util.Random;

public class lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        int nums[] = new int[6];
        int picked = 0;

        while(picked < 6) {
            int r = rand.nextInt(1, 46);
            System.out.print(r+" ");
            for(int n:nums) {
                if(n == r) {
                    System.out.print("\b(중복발생! 재추첨) ");
                    picked--;
                    break;
                }
            }
            nums[picked] = r;
            picked++;
        }
    }
}
