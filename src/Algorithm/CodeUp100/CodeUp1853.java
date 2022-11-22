package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp1853 {

    public static int sum(int n) {

        if (n==1) {
            return 1;
        }

        return sum(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }

}
