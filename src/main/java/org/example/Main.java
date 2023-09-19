// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요 >> ");
        int age = sc.nextInt();
        System.out.println("당신의 나이는 " + age + "살 입니다.");
        if (19>=age || 60<=age) {
            System.out.println("할인 대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }


        // 구현시작

        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
    }
}