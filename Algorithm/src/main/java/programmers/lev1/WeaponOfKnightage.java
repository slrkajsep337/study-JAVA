package programmers.lev1;

public class WeaponOfKnightage {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<number+1; i++) {
            int cnt = 0;
            //약수 개수 구하기
            for(int j=1; j<(int)(Math.sqrt(i))+1; j++) {
                if(i%j==0) {
                    if(i/j == j)
                        cnt += 1;
                    else
                        cnt += 2;
                }
            }
            if(cnt>limit)
                answer += power;
            else
                answer += cnt;
        }
        return answer;
    }
}
