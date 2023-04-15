package programmers.lev1;

public class SplitString {
    public int solution(String s) {

        char target = 'a';
        int answer = 0;
        int tcnt = 0;
        int ntcnt = 0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(i==0 || tcnt==ntcnt) {
                target = c;
                tcnt = 1;
                ntcnt = 0;
                answer ++;
            } else {
                if(c==target) {
                    tcnt++;
                } else {
                    ntcnt++;
                }
            }
        }
        return answer;
    }

}
