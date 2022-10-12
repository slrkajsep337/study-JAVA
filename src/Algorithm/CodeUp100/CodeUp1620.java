package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = 0;

        while(true) {
            //한번 1의자릿수까지 다 더했을 때
            if(num<1) {
                if (sum<10) {
                    System.out.println(sum);
                    break;
                } else {
                    num = sum;
                    sum = 0;
                }
            } else {
                sum += num%10;
                num /= 10;
            }
        }
    }
}
