package programmers.lev1;

import java.util.Arrays;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(score);

        for(int i=score.length-1; i>=0; i--) {
            cnt += 1;
            if(cnt==m) {
                answer += score[i]*m;
                cnt = 0;
            }
        }
        return answer;
    }

}
