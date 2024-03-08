package variable;

public class Variable5 {
    public static void main(String[] args) {
        String str = "abcdefg";
        //역순으로 char를 대문자로 출력하시오
        char c[] = str.toUpperCase().toCharArray();
        for(int i = str.length()-1; i>=0; i--) {
            System.out.println(c[i]);
        }
    }
}
