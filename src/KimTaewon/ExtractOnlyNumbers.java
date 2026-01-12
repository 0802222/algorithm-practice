package KimTaewon;

import java.util.Scanner;

public class ExtractOnlyNumbers {

    public int solution(String s) {
        // 방법1. 아스키 코드에서 숫자 : '0' (48) ~ '9' (57)
//        int answer = 0;
//        for (char x : s.toCharArray()) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }
//        return answer;

        // 방법2. isDigit() + Integer.parseInt() 사용
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        ExtractOnlyNumbers T = new ExtractOnlyNumbers();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}