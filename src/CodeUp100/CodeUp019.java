package CodeUp100;


import java.util.Scanner;

public class CodeUp019 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String[] date = str.split("[.]");
//
//        for(int i =0; i<date.length; i++) {
//            if (date[i].length() == 1) {
//                System.out.print("0");
//            }
//            System.out.print(date[i]);
//            if (i != date.length-1) {
//                System.out.print(".");
//            }

        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        String date[] = value.split("[.]");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        //%04d 4칸을 출력한다는 의미, 빈공간은 0으로 채운다
        System.out.println(String.format("%04d.%02d.%02d", year, month, day));
    }
}

