package question;

import java.util.Scanner;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 */

public class Q_1008 {
    public static void main(String[] args) {
        // 입력을 받기위한 Scanner 클래스 선언
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 출력부 : 정수끼리의 연산은 소수점 이하의 값을 기대할 수 없으므로
        // double 타입으로 형변환을 해준 후 몫 연산자를 통해 값을 도출한다.
        System.out.println((double)A/B);
    }
}
