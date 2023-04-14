package programmers.lev1;

import java.util.*;

//대충 만든 자판
public class Keyboard {
    public static List<Integer> solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> keycnt = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                if (!keycnt.containsKey(key.charAt(i)) || keycnt.get(key.charAt(i)) > i + 1)
                    keycnt.put(key.charAt(i), i + 1);
            }
        }

        for (String target : targets) {
            int temp = 0;
            for (int i = 0; i < target.length(); i++) {
                char t = target.charAt(i);
                if (!keycnt.containsKey(t)) {
                    temp = -1;
                    break;
                }
                temp += keycnt.get(t);
            }
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"ABACD", "BCEFD"};
        String[] b = {"ABCD","AABB"};
        System.out.println(solution(a, b));
    }
}
