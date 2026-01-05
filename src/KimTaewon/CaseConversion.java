package KimTaewon;

import java.util.Scanner;

public class CaseConversion {

    public String solution(String str) {
        String answer = "";
        // 방법1. 대소문자 바꾸기
        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) {
//                answer += Character.toUpperCase(x);
//            } else {
//                answer += Character.toLowerCase(x);
//            }

            // 방법2. 아스키 넘버로 풀기
            // 대문자 아스키 넘버 : 65 ~ 90
            // 소문자 아스키 넘버 : 97 ~ 122
            // 둘의 차이는 32
            if (x >= 97 && x <= 122) {
                answer += (char)(x - 32);
            } else {
                answer += (char)(x + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CaseConversion T = new CaseConversion();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}