import java.util.Arrays;

public class SieveOfEratosthenesPrac {

    public static void main(String[] args) {
        //에라토스테네스의 체 -> 핵심은 %, add(), remove() 연산을 하지 않는 것

        int N = 50; // N = 50
        int[] nums = new int[N - 1]; // N-1개만큼 2~50까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false


        for (int i = 2; i < nums.length; i += 2) checks[i] = false;
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기

        for (int i = 0; i < nums.length; i++) {
            if (checks[i] == true) System.out.println(nums[i]);
        }
    }

}
