package datastructure;

import java.util.HashMap;
import java.util.Map;

//프로그래머스 - 완주하지 못한 선수
public class HashTableRunning {

    //해쉬맵에 participant 원소를 키값으로, 해당 키값이 나올때마다 value++
    //그리고 completion의 원소와 위에서 생성한 해쉬맵의 키값이 같다면, 해당키가 나올때마다 value--
    //그러면 completion에 해당안되는 사람은 >0 값을 가지게 되고, 중복 키값도 처리 가능하다
    //그 값만 골라서 출력
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            Map<String, Integer> hm = new HashMap<>();

            for(String p: participant) {
                hm.put(p, hm.getOrDefault(p, 0)+1);
            }
            for(String c: completion) {
                hm.put(c, hm.getOrDefault(c, 0)-1);
            }

            for(String key: hm.keySet()) {
                if(hm.get(key) != 0) {
                    answer += key;
                    break;
                }
            }

            return answer;
        }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        HashTableRunning htr = new HashTableRunning();
        htr.solution(participant, completion);

    }
}
