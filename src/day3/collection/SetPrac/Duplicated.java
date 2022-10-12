package day3.collection.SetPrac;

import java.util.HashSet;

public class Duplicated {
    public static void main(String[] args) {
      //random숫자 50개를 생성한후 중복이 없는 숫자만 남기기

        RandomNumberGenerator rdng = new RandomNumberGenerator();
        HashSet<Integer> numbers = new HashSet<>();
        for(int i=0; i<50; i++) {
            int r = rdng.generate(10);
            numbers.add(r);
//            System.out.println(r);

        }
        System.out.println(numbers);
    }
}
