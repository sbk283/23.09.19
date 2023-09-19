// -100부터 25까지의 합을 더한 결과를 출력해주세요.

class Main {
    public static void main(String[] args) {
        int sum = 0;
        int start = -100;
        int end = 25;

        int i = 1;
        while (i <= end) {
            sum += i;
            i++;
        }
        System.out.println("sum : " + sum);
    }
}