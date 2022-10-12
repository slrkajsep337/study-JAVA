package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] str2 = str1.split("\\.");


        for (String s: str2) {
            System.out.println(s);
        }


    }
}
