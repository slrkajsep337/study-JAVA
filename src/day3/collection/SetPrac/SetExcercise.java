package day3.collection.SetPrac;

import java.util.HashSet;
import java.util.Set;

public class SetExcercise {
    //set: 중복을 허용하지 않는 List -> 중복검사를 할 수 있음

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김미미");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(3);
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);

        System.out.println(set1);
        System.out.println(setInteger);
    }





}
