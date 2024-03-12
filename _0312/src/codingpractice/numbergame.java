package codingpractice;

import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int r = rand.nextInt(1, 101);

        while(true) {
            System.out.println("번호를 입력하세요.");
            int n = sc.nextInt();

            if(n > r) System.out.println("번호가 정답보다 큽니다.");
            else if(n < r) System.out.println("번호가 정답보다 작습니다.");
            else{
                System.out.println("정답입니다.");
                return;
            }

        }
    }

}
