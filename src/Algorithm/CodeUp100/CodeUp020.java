package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] data = str.split("-");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);

        }
    }

}
