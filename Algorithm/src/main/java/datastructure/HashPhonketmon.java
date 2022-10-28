package datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashPhonketmon {

    public int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;

        Map<Integer, Integer> hm = new HashMap<>();

        for(Integer i: nums) {
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for(Integer key: hm.keySet()) {
            if(hm.get(key) > 0) {
                cnt += 1;
            }
        }

        if (cnt>nums.length/2) answer = nums.length/2;
        else answer = cnt;

        return answer;
    }

    public int solution2(int[] nums) {
        int answer = 0;
        int cnt = 0;

        Map<Integer, Integer> hm = new HashMap<>();

        for(Integer i: nums) {
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for(Integer key: hm.keySet()) {
            if(hm.get(key) > 0) {
                cnt += 1;
            }
        }

        if (cnt>nums.length/2) answer = nums.length/2;
        else answer = cnt;

        return answer;
    }



    public static void main(String[] args) {


    }
}
