package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);
        System.out.printf("%.1f",((float)a+(float)b+(float)c)/3);

    }
}
