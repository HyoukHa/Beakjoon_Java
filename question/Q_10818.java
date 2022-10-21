package question;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */

public class Q_10818 {
    public static void main(String[] args) {
        // 입력을 받기위한 Scanner 클래스 선언
        Scanner scanner = new Scanner(System.in);

        // 입력할 수의 개수 입력
        String n = scanner.nextLine();
        // 공백을 기준으로 수 입력
        String A = scanner.nextLine();

        int a = Integer.parseInt(n);
        // 배열에 입력받은 것들을 나눠서 저장해준다.
        String[] As = A.split(" ");
        int[] Bs = new int[a];
        // 배열을 숫자로 변환해준다.
        for (int i = 0 ; i < a ; i++) {
            Bs[i] = Integer.parseInt(As[i]);
        }
        // Arrays 를 이용해 배열을 정렬한다.
        Arrays.sort(Bs);

        // 정렬된 배열에서 가장 처음인덱스와 마지막 인덱스를 출력한다.
        System.out.print(Bs[0] + " " + Bs[Bs.length-1]);
    }
}
