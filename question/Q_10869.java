package question;

import java.util.Scanner;

/**
 * 문제
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 *
 * 출력
 * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 */

public class Q_10869 {
    public static void main(String[] args) {
        // 입력을 받기위한 Scanner 클래스 선언
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 덧셈 연산자 : +
        System.out.println(A + B);

        // 빼기 연산자 : -
        System.out.println(A - B);

        // 곱셈 연산자 : *
        System.out.println(A * B);

        // 몫 연산자 : /
        System.out.println(A / B);

        // 나머지 연산자 : %
        System.out.println(A % B);
    }
}
