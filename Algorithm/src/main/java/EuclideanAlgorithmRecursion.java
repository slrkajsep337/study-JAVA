import java.util.Scanner;

public class EuclideanAlgorithmRecursion {

    public static int solution(int a, int b) {

        if (a==b) return a;
        else if (a<b) return solution(a, b-a);
        else return solution(a-b, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a,b));
    }


}
