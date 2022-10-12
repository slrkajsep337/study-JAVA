package CodeUp100;

import java.util.Scanner;

public class CodeUp2081 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int midx = 0;

        for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            if (max<arr[i]) {
                    max = arr[i];
                    midx = i;
            }
        }
        System.out.println(max);
        System.out.println(midx+1);





    }
}
