package question;

import java.util.Scanner;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 각 테스트 케이스마다 A+B를 출력한다.
 */

public class Q_10950 {
    public static void main(String[] args) {
        // 입력을 받기위한 Scanner 클래스와 출력을 위한 StringBuilder 선언
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 반복할 횟수를 입력받아 scope에 저장한다.
        int scope = scanner.nextInt();

        // for 문을 통해 scope만큼 반복한다.
        for (int i = 0 ; i < scope ; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            // 연산한 값을 개행문자를 기준으로 sb(StringBuilder)에 저장한다.
            sb.append(n1 + n2 + "\n");
        }

        System.out.println(sb.toString());
    }
}
