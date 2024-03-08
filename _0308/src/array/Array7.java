package array;

import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        //5행 5열 배열에
        //각 열에 random하게 중복되지 않은 1~100의 수를 발생시킨다.
        //각 열에 최대값의 합과 최소값의 합을 출력하시오
        Random r = new Random();
        int arr[][] = new int[5][5];
        int chk[];
        int num, maxv = 0, minv = 0, maxsum = 0, minsum = 0;

        for(int i=0;i<5;i++) {
            chk = new int[101];
            for(int j=0;j<5;j++) {
                num = r.nextInt(100)+1;
                if(chk[num] == 1) j--;
                else {
                    arr[i][j] = num;
                    chk[num] = 1;
                }
            }
            maxsum = arr[i][0];
            minsum = arr[i][0];
            for(int a:arr[i]) {
                if(maxv < a) maxv = a;
                if(minv > a) minv = a;
            }
            maxsum += maxv;
            minsum += minv;
        }
        System.out.println(maxsum+" "+minsum+" "+(maxsum+minsum));
    }
}
