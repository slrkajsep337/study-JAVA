package CodeUp100;

import java.util.Scanner;

public class CodeUp2081 {
    public static void main(String[] args) {
        //모든 값이 음수로 들어왔을 때는 max 값을 입력받은 첫번째 값으로 변경해준다

        Scanner sc =  new Scanner(System.in);
        int num ;
        int max = 0;
        int midx = 0;

        for(int i=0; i<9; i++) {
            num = sc.nextInt();
            if (max<num) {
                max = num;
                midx = i+1;
            }

        }

//        int[] arr = new int[9];
//        int max = 0;
//        int midx = 0;
//
//        for(int i=0; i<9; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<arr.length; i++) {
//            if (max<arr[i]) {
//                max = arr[i];
//                midx = i+1;
//            }
//        }

        System.out.println(max);
        System.out.println(midx);





    }
}
