public class EuclideanAlgorithm {
    public static int solution(int a, int b) {

        while (a != b) {
            if(a>b) a -= b;
            else b -= a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(solution(64, 128));
    }

}
