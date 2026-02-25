package knou;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int BinarySearch(int[] A, int key, int left, int right) {
        if (left > right) {
            return (-1); // 찾지 못함
        }

        int mid = (left + right) / 2;

        if (A[mid] == key) {
            return (mid);
        } else if (key < A[mid]) {
            return BinarySearch(A, key, left, mid-1);

        } else {
            return BinarySearch(A, key, mid+1, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 : 배열 크기
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] += sc.nextInt();
        }

        // 찾을 key 입력
        int key = sc.nextInt();

        // 정렬
        Arrays.sort(A);

        // 탐색 실행
        int result = BinarySearch(A, key, 0, n - 1);

        // 결과 출력
        System.out.println("배열 A = " + Arrays.toString(A));
        if (result != -1) {
            System.out.println("키 " + key + "의 인덱스 = " + result);
        } else {
            System.out.println("키 " + key + "를 찾을 수 없습니다. " + result);
        }
        sc.close();
    }
}
