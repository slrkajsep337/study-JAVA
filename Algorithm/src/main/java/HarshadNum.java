public class HarshadNum {

    public static boolean solution(int x) {

        int num = x;
        //step1 자릿수의 합 구하기
        int sum = 0;
        while(x>0) {
            sum += x%10;
            x /= 10;
        }

        //step2 그 합으로 나누어 떨어지는지
        if(num%sum==0) return true;

        return false;

    }


    public static void main(String[] args) {
        System.out.println(solution(13));

    }
}
