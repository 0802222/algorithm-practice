package KimTaewon;

import java.util.Scanner;

public class MaximumGridSum {

    public int solution(int n, int[][] arr) {
        int answer = 0;

        // 행합
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > answer) {
                answer = rowSum;
            }
        }

        // 열합
        for (int i = 0; i < n; i++) {
        int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += arr[j][i];
            }
            if (colSum > answer) {
                answer = colSum;
            }
        }

        // 대각선 합
        int crossSum1 = 0; // 왼쪽 위 ↘ 오른쪽 아래
        for (int i = 0; i < n; i++) {
            crossSum1 += arr[i][i];
        }
        if (crossSum1 > answer) {
            answer = crossSum1;
        }

        int crossSum2 = 0; // 오른쪽 위 ↙ 왼쪽 아래
        for (int i = 0; i < n; i++) {
            crossSum2 += arr[i][n - 1 - i];
        }
        if (crossSum2 > answer) {
            answer = crossSum2;
        }

        return answer;
    }

    public static void main(String[] args) {
        MaximumGridSum T = new MaximumGridSum();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = T.solution(n, arr);
        System.out.println(answer);
    }
}