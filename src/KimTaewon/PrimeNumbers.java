package KimTaewon;

import java.util.Scanner;

public class PrimeNumbers {

    public int solution(int n) {

        int answer = 0;

        // 소수 판별 : 에라토스테네스 체 개념 사용
        // 크기 N짜리 배열을 만들어 전부 소수라고 가정
        // 2부터 시작해서 아직 지워지지 않은 수의 배수들을 모두 지움
        // 남아있는 수의 개수를 세면 그게 소수 개수가 됨

        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumbers T = new PrimeNumbers();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.solution(n));
    }
}