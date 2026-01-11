package KimTaewon;

import java.util.Scanner;

public class PalindromeString {

    public String solution(String str) {

        // 방법1
//        String answer = "YES";
//        str = str.toUpperCase();
//        int len = str.length();
//
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }

        // 방법2
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        PalindromeString T = new PalindromeString();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}