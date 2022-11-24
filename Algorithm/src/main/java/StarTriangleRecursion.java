import java.util.Scanner;

public class StarTriangleRecursion {

    static String repeat(int num, int cnt) {

        if (cnt==0) {
            if (num==0)
                return "";
            System.out.println();
            return solution(num-1);
        }
        System.out.print("*");
        return repeat(num, cnt-1);

    }

    static String solution(int num) {
        return repeat(num, num);
    }

    public static String getStars(int n) {
        // 별을 만든다
        if(n == 0) return "";
        return "*" + getStars(n - 1);
    }
    public static void printStar(int n) { // 별을 출력한다
        if(n == 0) return;
        // n은 작아지지만
        // 출력은 1부터 n까지
        printStar(n - 1);
        System.out.println(getStars(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));

        printStar(4);

    }
}
