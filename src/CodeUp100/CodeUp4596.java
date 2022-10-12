package CodeUp100;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        //입력받는 모든 값들이 음수일때는 max를 음수값이나, 입력받는 첫번째 값으로 설정해준다
        Scanner sc = new Scanner(System.in);

        int num=0;
        int max=0;
        int idx_a=0;
        int idx_b=0;


        for (int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                num = sc.nextInt();
                if(max<num) {
                    max = num;
                    idx_a = i+1;
                    idx_b = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(idx_a+" "+idx_b);

    }
}
