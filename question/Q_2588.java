package question;

import java.util.Scanner;

/**
 * 문제
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *
 *                  4   7   2     ----- (1)
 *              x   3   8   5     ----- (2)
 * -----------------------------
 *              2   3   6   0     ----- (3)
 *          3   7   7   6         ----- (4)
 *      1   4   1   6             ----- (5)
 * -----------------------------
 *      1   8   1   7   2   0     ----- (6)
 *
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 *
 * 출력
 * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */

public class Q_2588 {
    public static void main(String[] args) {
        // 입력을 받기위한 Scanner 클래스 선언
        Scanner scanner = new Scanner(System.in);

        // 연산할 두 세자리수 입력
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 입력받은 두번째 숫자 B를 스트링으로 변환 한 이후 split 함수를 이용하여 배열 C1에 저장
        String C = String.valueOf(B);
        String[] C1 = C.split("");

        // C1 배열의 길이만큼 반복함
        for (int i = C1.length - 1 ; i >= 0 ; i--) {
            // C1의 마지막부터 A와 곱하여 D에 저장 후 곱한 결과를 출력
            int D = Integer.parseInt(C1[i]);
            System.out.println(A * D);
        }

        // 마지막으로 두 수를 곱한 결과를 출력
        System.out.println(A*B);
    }
}
