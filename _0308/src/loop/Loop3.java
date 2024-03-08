package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out:while(true) {
            System.out.println("input command..(q,c,r,u,d)");
            String cmd = sc.next();
            if(cmd.equals("q")) {
                System.out.println("bye");
                sc.close();
                break;
            }
            switch (cmd) {
                case "c": System.out.println("create"); break;
                case "r": System.out.println("read");
                    String id = sc.next();
                    System.out.println("read ID info...");
                    break;
                case "u": System.out.println("update"); break;
                case "d": System.out.println("delete"); break;
                default: System.out.println("try again");
            }

            System.out.println("end...");
        }
    }
}
