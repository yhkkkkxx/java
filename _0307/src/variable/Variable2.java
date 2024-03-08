package variable;

public class Variable2 {
    public static void main(String[] args) {
        //정수 default: int
        int a = 10;
        byte a1 = 100; //~127
        byte a2 = 100;
        byte a3 = (byte) (a1 + a2); //32bit로 계산된다.
        System.out.println(a3);
        long a5 = 2150000000L;
        long a6 = 100000000 + 1000000L; //큰 숫자에 맞춰 64bit로 계산
        long a7 = 1150000000 + 1150000000; //L 안붙이면 32bit에 꾸역꾸역 맞춰 계산
        System.out.println(a7);

        char ch = 'A'; //character
        System.out.println((int)ch);

        char ch2 = '\u0042'; //unicode
        System.out.println(ch2);
        char ch3 = 0xac00;
        System.out.println(ch3);



        //실수 default: double
        double d = 10.0;
        float f = 10.0F; //float:32bit, 10.0:64bit -> 10.0F
        float f2 = 10.1F + 10;







        //Boolean
        boolean b = true;

    }

}
