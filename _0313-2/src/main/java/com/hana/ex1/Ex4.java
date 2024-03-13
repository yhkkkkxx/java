package com.hana.ex1;

public class Ex4 {
    public static void main(String[] args) {
        int i = 10 / 2;
        String str = "1000";
        int num = 0;


        try {
            num = Integer.parseInt(str);
            int result = 10 / 0;
            System.out.println(num);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("입력값이 이상합니다.");
//        } catch (NumberFormatException e) {
//            System.out.println("입력값이 이상합니다.");
//        } catch (ArithmeticException e) {
//            System.out.println("분모가 0 입니다.");
        } catch (Exception e) {
            System.out.println("끝");
        }
    }
}
