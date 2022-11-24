import java.util.Scanner;

public class FibonacciRecursion {
    static int solution(int num) {
        if (num==1 || num==2) return 1;
        return solution(num-1)+solution(num-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
    }
}
