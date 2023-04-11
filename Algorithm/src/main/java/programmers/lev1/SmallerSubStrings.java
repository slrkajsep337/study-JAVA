package programmers.lev1;

import java.util.stream.LongStream;

public class SmallerSubStrings {

    public int solution(String t, String p) {
        int answer = 0;
        int l = p.length();
        Long origin = Long.parseLong(p);
        for (int i =0; i<t.length()-l+1; i++) {
            if (Long.parseLong(t.substring(i, i+l))<=origin) {
                answer += 1;
            }
        }
        return answer;
    }

    //다른 풀이 - Stream 이용, 근데 시간 느림
    public int solution2(String t, String p) {
        long targetNumber = Long.parseLong(p);
        int targetNumberLength = p.length();

        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                .mapToLong(Long::parseLong)
                .filter(number -> number <= targetNumber)
                .count();
    }

}
