package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(90<=score && score<=100) System.out.println("A");
        else if(70<=score && score<=89) System.out.println("B");
        else if(40<=score && score<=69) System.out.println("C");
        else if(0<=score && score<=39) System.out.println("D");




    }
}
