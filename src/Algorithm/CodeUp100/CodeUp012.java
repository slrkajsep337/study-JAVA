package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        //소수점 6째자리까지 출력될 수 있도록 하기
        System.out.print(String.format("%.6f", num));
    }

}
