package array;

import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        Random r = new Random();
//        int num = r.nextInt(10) + 1;
//        System.out.println(num);

        //int형 배열, 사이즈 10개
        //배열에 1~100의 숫자를 random하게 넣고
        //합과 평균을 구하시오
        int [] arr = new int[10];

        for(int i=0;i<10;i++) {
            arr[i] = r.nextInt(10) + 1;

            for(int j=0;j<i;j++)
                if(arr[i] == arr[j]) i--;
        }
        int sum = 0;
        for(int a:arr) sum += a;
        int avg = sum/10;
        System.out.println(avg);

    }
}
