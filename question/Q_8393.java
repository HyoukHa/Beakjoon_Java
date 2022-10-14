package question;

import java.util.Scanner;

/**
 * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * 출력
 * 1부터 n까지 합을 출력한다.
 */

public class Q_8393 {
    public static void main(String[] args) {
        // 입력을 받기위한 Scanner 클래스 선언
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = scanner.nextInt();

        // 연산부 : sum 에 1부터 n까지의 수를 더한다
        for (int i = 0 ; i <= n ; i ++) {
            sum += i;
        }

        // 출력부 : 1 ~ n 까지의 합을 출력한다.
        System.out.println(sum);
    }
}
