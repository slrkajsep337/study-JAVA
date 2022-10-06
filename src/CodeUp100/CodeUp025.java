package CodeUp100;

import java.util.Scanner;

public class CodeUp025 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String num = sc.next();
        int cnt = num.length()-2; //5

        for (int i=0; i<num.length(); i++) {
            System.out.print("["+num.charAt(i));
            for(int j=cnt; j>-1; j--) {
                System.out.print("0");
            }
            cnt--;
            System.out.println("]");
        }
    }
}
