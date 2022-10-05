import java.util.Scanner;

public class OddEvenPlus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 2 == 0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
        System.out.print("+");
        if (b % 2 == 0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
        System.out.print("=");
        if ((a + b) % 2 == 0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
    }
}
