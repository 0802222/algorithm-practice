package KimTaewon;

import java.util.Scanner;

public class RockPaperScissorsGame {

    public String solution(int n, int[] A, int[] B) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            // 1: 가위, 2: 바위, 3: 보
            if (A[i] == B[i]) {
                answer += "D"; // 비김
            } else if (A[i] == 1 && B[i] == 3) {
                answer += "A";
            } else if (A[i] == 2 && B[i] == 1) {
                answer += "A";
            } else if (A[i] == 3 && B[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RockPaperScissorsGame T = new RockPaperScissorsGame();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        for (char x : T.solution(n, A, B).toCharArray()) {
            System.out.println(x);
        }
    }
}