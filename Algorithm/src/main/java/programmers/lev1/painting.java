package programmers.lev1;

//덧칠하기
public class painting {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int now = section[0]-1;
        for(int s : section) {
            if(s > now) {
                answer++;
                now = s-1+m;
            }

        }
        return answer;
    }
}
