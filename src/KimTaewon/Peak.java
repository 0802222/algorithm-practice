package KimTaewon;

import java.util.Scanner;

public class Peak {
    int[] dx = {-1, 0, 1, 0}; // direction
    int[] dy = {0, 1, 0, -1};

    public int solution(int n , int[][] arr) {
        int answer = 0; // 봉우리 카운트

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 봉우리 판별 (dx, dy 탐색)
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k]; // next
                    int ny = j + dy[k];

                    // 바운더리 && 봉우리 검증
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Peak T = new Peak();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}