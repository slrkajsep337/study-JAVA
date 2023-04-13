package programmers.lev1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class RunningRace {
    //시간초과
    public static String[] solution(String[] players, String[] callings) {
        String temp;
        for(String c : callings) {
            //indexOf로 인덱스를 가져오는 것은 너무 느리다
            int idx = Arrays.asList(players).indexOf(c);
            temp = players[idx-1];
            players[idx-1] = players[idx];
            players[idx] = temp;

        }

        return players;
    }

    public static String[] solution2(String[] players, String[] callings) {
        HashMap<String, Integer> indexMap = new HashMap<>();
        int n = players.length;
        for (int i = 0; i < n; i++) {
            indexMap.put(players[i], i);
        }

        String temp;
        for(String c : callings) {
            int idx = indexMap.get(c);
            temp = players[idx-1];
            players[idx-1] = players[idx];
            players[idx] = temp;

            indexMap.put(players[idx-1], idx-1);
            indexMap.put(players[idx], idx);
        }

        return players;
    }


    private static Map<String, Integer> playerInfo = new HashMap<>();
    //속도 느림
    public String[] solution3(String[] players, String[] callings) {
        makeInfo(players);

        Arrays.stream(callings).forEach(player -> {
            int idx = playerInfo.get(player);
            String frontPlayerName = players[idx - 1];
            players[idx] = frontPlayerName;
            players[idx - 1] = player;

            playerInfo.put(frontPlayerName, idx);
            playerInfo.put(player, idx - 1);
        });

        return players;
    }

    private static void makeInfo(String[] players) {
        IntStream.range(0, players.length).forEach(index -> {
            playerInfo.put(players[index], index);
        });
    }

    public static void main(String[] args) {
        String[] a = {"mumu", "soe", "poe", "kai", "mine"};
        String[] b = {"kai", "kai", "mine", "mine"};

        System.out.println(solution(a, b));
    }

}
