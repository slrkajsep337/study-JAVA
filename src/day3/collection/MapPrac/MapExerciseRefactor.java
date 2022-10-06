package day3.collection.MapPrac;

import java.util.HashMap;

class JudgeAlpha{
    public boolean isAlphabet(char c) {
        if(c >= 65 && c<=90 || 97 <= c && c <= 122) {
            return true;
        }
        return false;
    }
}
//데이터 수가 굉장히 많을때 list는 속도가 느릴 수 있다. map을 사용하면 key값을 이용하여 시간을 단축시킬 수 있음
public class MapExerciseRefactor {



    public static void main(String[] args) {
        JudgeAlpha ja = new JudgeAlpha();

        String s1 = "aaabbbcccddefghijkkklSlm".toUpperCase();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (int i = 65; i < 91; i++) {
            alphabetMap.put((char) i, 0);
        }
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean isAlphabet = ja.isAlphabet(c);
            if (isAlphabet) {
                alphabetMap.put(c, alphabetMap.get(c)+1);
            }
        }
        for (int i = 65; i < 91; i++) {
            System.out.println((char)i + " " +alphabetMap.get((char) i));
        }
        System.out.println(s1);
        }

    }

