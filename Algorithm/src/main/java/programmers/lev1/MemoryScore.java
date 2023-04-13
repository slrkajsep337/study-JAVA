package programmers.lev1;

import java.util.*;

public class MemoryScore {
    public static List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> scoreIdx = new HashMap<>();
        int l = name.length;
        for (int i=0; i<l; i++) {
            scoreIdx.put(name[i], i);
        }

        for (String[] p : photo) {
            int score = 0;
            for (String n : p) {
                if (scoreIdx.containsKey(n)) {
                    int idx = scoreIdx.get(n);
                    score += yearning[idx];
                }
            }
            answer.add(score);
        }
        return answer;

    }

    public static void main(String[] args) {

        String[] a = {"may", "kein", "kain", "radi"};
        int[] b = {5, 10, 1, 3};
        String[][] c = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(solution(a, b, c));
    }

}
