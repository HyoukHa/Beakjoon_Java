package question;

import java.util.Scanner;

/**
 * 문제
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 *
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 *
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 *
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 N의 사이클 길이를 출력한다.
 */

public class Q_1110 {
    public static void main(String[] args) {
        // 입력을 받기위한 Scanner 클래스 선언
        Scanner scanner = new Scanner(System.in);

        // 사이클 수를 저장하기위한 변수 n을 0으로 초기화
        int n = 0;
        int a = scanner.nextInt();
        // 계산된 결과를 비교할 b를 a의 값으로 초기화
        int b = a;
        String A;
        while(true) {
            if (a < 10) {
                // 입력된 숫자가 한자리 수일경우 앞에 0을 붙여 문자열로 저장해준다..
                A = "0" + Integer.toString(a);
            }else {
                // 입력된 숫자가 두자리 수일경우 A에 저장한다.
                A = Integer.toString(a);
            }

            // 저장된 A를 나눠서 배열로 저장한다.
            String[] As = A.split("");
            // As에 저장된 각 숫자를 더해서 배열로 저장한다.
            String[] Cs = Integer.toString((Integer.parseInt(As[0]) + Integer.parseInt(As[1]))).split("");
            // As와 Cs에 저장된 마지막 인덱스값을 붙여준다.
            A = As[As.length - 1] + Cs[Cs.length - 1];
            // 기존의 수와 비교하기위해 A에 저장된 문자열을 형변환해준다.
            a = Integer.parseInt(A);
            // 한 사이클이 돌았기때문에 n에 1을 더해준다.
            n += 1;

            // 탈출조건 : 연산한 a와 초기값 b가 같은경우 탈출한다.
            if ( a == b ) {
                break;
            }
        }
        System.out.println(n);
    }
}
