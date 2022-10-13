package question;

import java.util.Scanner;

/**
 * 문제
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 *
 * 입력
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 *
 * 출력
 * 출력형식과 같게 N*1부터 N*9까지 출력한다.
 */

public class Q_2739 {
    public static void main(String[] args) {
        // 입력을 받기위한 Scanner 클래스 선언
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        // 출력부 : for 문을 통해 입력받은 숫자를 1~9와 곱하여 결과를 출력한다.
        for (int i = 1 ; i < 10 ; i++) {
            System.out.println(A + " * " + i + " = " + A*i);
        }
    }
}
