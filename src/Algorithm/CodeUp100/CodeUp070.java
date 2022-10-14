package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num==12 || num==1 || num==2) System.out.println("winter");
        else if(num==3 || num==4 || num==5) System.out.println("spring");
        else if(num==6 || num==7 || num==8) System.out.println("summer");
        else System.out.println("fall");
    }
}
