package KimTaewon;

import java.util.Scanner;

public class VisibleStudents {

    public int solution(int n, int[] heights) {
        int answer = 0;
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            if (heights[i] > maxHeight) {
                answer++;
                maxHeight = heights[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        VisibleStudents T = new VisibleStudents();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, heights));
    }
}