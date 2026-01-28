package KimTaewon;

import java.util.Scanner;

public class AppointATemporaryClassLeader {

    public int solution(int n, int[][] arr) {
        int answer = 0;  // 임시 반장 번호
        int max = -1;    // 최대 친구 수

        for (int i = 0; i < n; i++) {        // i 번째 학생
            int cnt = 0;                     // i 의 친구 수

            for (int k = 0; k < n; k++) {    // 다른 학생 k
                if (k == i) {
                    continue;
                }

                for (int j = 0; j < 5; j++) {
                    if ((arr[i][j] == arr[k][j])) {
                        cnt++;       // 같은 반인 학생 1명 추가
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer + 1;
    }

    public static void main(String[] args) {
        AppointATemporaryClassLeader T = new AppointATemporaryClassLeader();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {       // 학생
            for (int j = 0; j < 5; j++) {   // 학년
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}