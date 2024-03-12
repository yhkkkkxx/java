package codingpractice;

import java.util.Random;

public class textbaseball {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int i=1, out = 0;

        System.out.println("게임시작!");
        Thread.sleep(1000);
        while(true) {
            if(i <= 3) System.out.println(i+"번타자");
            int ball = 0, strike = 0;
            Thread.sleep(1000);

            while(true) {
                int r = rand.nextInt(2);
                if(r == 0) {
                    System.out.println("스트라이크!");
                    strike++;
                }
                else {
                    System.out.println("볼~");
                    ball++;
                }

                if(strike == 3) {
                    Thread.sleep(1000);
                    System.out.println("삼진 아웃!");
                    out++;
                    i++;
                    Thread.sleep(1000);
                    if(out == 3) {
                        System.out.println("게임종료!");
                        Thread.sleep(1000);
                        return;
                    }
                    break;
                }
                if(ball == 4) {
                    Thread.sleep(1000);
                    System.out.println("1루 진루!");
                    i++;
                    Thread.sleep(1000);
                    break;
                }

                Thread.sleep(1000);
            }
        }

    }

}
