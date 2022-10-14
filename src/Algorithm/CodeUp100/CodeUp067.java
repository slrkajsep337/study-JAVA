package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        if(num<0) {
            System.out.println("minus");
        }else {
            System.out.println("plus");
        }

        if(num%2==0) {
            System.out.println("even");
        }else System.out.println("odd");
    }
}
