public class SieveOfEratosthenes {


    class Solution {
        public int solution(int length) {
            int[] arr = new int[length-1];


            for (int i = 0; i < arr.length; i++) {
                arr[i] = i+2;
            }

            for (int i = 2; i*i <= length ; i++) {
                for (int j = 2*(i-1); j < arr.length ; j +=i) {
                    arr[j] = 0;
                }
            }


            // 소수의 개수 출력
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

}
