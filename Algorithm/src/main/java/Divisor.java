public class Divisor {
    public static int sol(int num) {
        int answer = 0;

        for(int i=1; i<num+1; i++) {
            if (num%i == 0) {
                answer += i;

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(sol(12));
    }
}
