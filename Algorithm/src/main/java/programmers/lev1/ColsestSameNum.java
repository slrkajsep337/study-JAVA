package programmers.lev1;
import java.util.*;
public class ColsestSameNum {
    public List<Integer> solution(String s) {

        List<Integer> answer = new ArrayList<>();
        HashMap<Character, Integer> alph = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            if(!alph.containsKey(a)) {
                alph.put(a, i);
                answer.add(-1);
            } else {
                answer.add(i-alph.get(a));
                alph.put(a, i);
            }
        }

        return answer;


    }

}
