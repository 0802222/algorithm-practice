package KimTaewon;

import java.util.Scanner;

public class ValidPalindrome {

    public String solution(String s) {
        String answer = "NO";

        // replaceAll 을 통해 정규식을 작성 (^A~Z : A~Z 가 아닌것들 제거하라는 뜻)
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();

        if (s.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        ValidPalindrome T = new ValidPalindrome();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }
}