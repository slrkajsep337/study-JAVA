package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp1936 {
    public static int solution(int a, int b) {
        if(a > b) {
            return solution(a/2,b) + 1;
        } else if (a < b) {
            return solution(a, b/2) +1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(solution(num1, num2));
    }
}
