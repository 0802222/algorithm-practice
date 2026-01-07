package KimTaewon;

import java.util.Scanner;

public class WordsInSentences {

    public String solution(String str) {
        String answer = "";
//        int m = Integer.MIN_VALUE;

        // 방법1. split 으로 입력받은 배열을 공백기준으로 자름
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }

        // 방법2. indexOf & subString 으로 풀기
        // pos 라는 공백을 담을 정수를 선언
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) !=- 1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            // str 의 범위를 잘라낸 공백 다음으로 변경
            str = str.substring(pos + 1);
        }
        // 범위탐색이 끝난 후 마지막 공백이 없으므로 answer 를 str 로 변경
        if (str.length() > m) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        WordsInSentences T = new WordsInSentences();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }
}