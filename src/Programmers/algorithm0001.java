package Programmers;

import java.util.Scanner;

public class algorithm0001 {
    //%연산 이용하기
    public int solution(int n) {

        int sum=0;
        //123 -> 몫 12, 나머지 3 -> 12%10 몫1, 나머지 2 -> 1
        while (n>0) {
            sum += n%10;
            n = n/10;
        }

        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {


    }
    //내가 처음 푼 풀이, 좋은 풀이는 아니다
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int sum=0;
//
//        //주의할점 -48
//        for (int i=0; i<str.length(); i++) {
//            sum += (int)(str.charAt(i))-48;
//        }
//
//        System.out.println(sum);
//    }

}
