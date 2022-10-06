package CodeUp100;

import java.util.Scanner;

public class CodeUp027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] str2 = str1.split("\\.");


        for (int i=str2.length-1; i>=0; i--) {
            System.out.print(str2[i]);
            if(i>0){
                System.out.print("-");
            }
        }
    }

}
