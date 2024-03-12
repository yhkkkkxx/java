package codingpractice;

import java.util.Scanner;

public class threesixninewithcom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;

        while(cnt < 40) {
            System.out.println(clap(cnt+""));
            cnt ++;

            String n = sc.next();
            if(!n.equals(clap(cnt+""))) {
                System.out.println("컴퓨터 승!");
                return;
            }
            cnt++;
        }
        System.out.println("무승부!\n게임종료");
    }

    public static int countChar(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static String clap(String cnt) {
        char tsn[] = {'3', '6', '9'};
        int c = 0;
        String answer = "";

        for(char ch:tsn) c += countChar(cnt, ch);

        if(c > 0){
            for(int i=0; i<c; i++) answer += "X";
            return answer;
        }
        else return cnt;
    }
}
