package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationMoveMap {
    private static Map<Long, PopulationMove> populationMoveMap = new HashMap<>();
    private static long sequence = 0L;

    public void save(PopulationMove populationMove){
        populationMove.setId(++sequence);
        populationMoveMap.put(populationMove.getId(), populationMove);
    }

    public String findById(long n) {
        String s="";
        s += populationMoveMap.get(n).getId() + " ,";
        s += populationMoveMap.get(n).getFromSido()+ " ,";
        s += populationMoveMap.get(n).getToSido();
        return s;
    }
}
