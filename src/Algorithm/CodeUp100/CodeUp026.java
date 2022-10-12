package Algorithm.CodeUp100;

import java.util.Scanner;


public class CodeUp026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] arr = time.split(":");

        //자바에서 문자열 비교는 "=="가 아닌 .equals()
        //==는 주소값을 비교한다
        if(arr[1].equals("00")) {
            System.out.println("0");
        } else {
            System.out.println(arr[1]);
        }

    }
}
