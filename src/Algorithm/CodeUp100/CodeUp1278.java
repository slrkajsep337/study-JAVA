package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int num =  sc.nextInt();

        //123 -> 12 -> 1 -> 0.1
        while(num>0) {
            num /= 10;
            cnt += 1;
        }

        System.out.println(cnt);

    }
}
