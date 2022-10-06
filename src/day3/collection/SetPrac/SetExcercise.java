package day3.collection.SetPrac;

import java.util.HashSet;
import java.util.Set;

public class SetExcercise {
    //set: 중복을 허용하지 않는 List -> 중복검사를 할 수 있음
    //random숫자 50개를 생성한후 중복이 없는 숫자만 남기기
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); //tree set
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김미미");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(setInteger);
    }





}
