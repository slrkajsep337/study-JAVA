package day3.collection.SetPrac;

import java.util.HashSet;
import java.util.Set;

public class AlphabetMain {
    public static void main(String[] args) {

        AlphabetGenerator randomAlphabetGenerator = new AlphabetGenerator();
        Set<Character> result = new HashSet<>();

        for (int i = 0 ; i < 50 ; i ++ ) {
            result.add(randomAlphabetGenerator.generator());
        }

        System.out.println(result);
    }
}
