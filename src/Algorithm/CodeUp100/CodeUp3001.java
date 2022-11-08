package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean check = false;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        for(int i=0; i<n; i++) {
            if (arr[i] == target) {
                System.out.println(i+1);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println(-1);
        }

    }
}
