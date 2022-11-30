package com.lamdaprac.lamdaprac.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class StudentTest {

    @Test
    void name() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher kyeongrok = new Teacher("김경록", true, true);
        Teacher kyeonghwan = new Teacher("고경환", true, false);
        Teacher sujin = new Teacher("김수진", false, true);
        Teacher sohyun = new Teacher("강소현", true, true);

        teachers.add(kyeongrok);
        teachers.add(kyeonghwan);
        teachers.add(sujin);
        teachers.add(sohyun);

        System.out.println("---알고리즘 true이신 분들--");
        //stream().filter 사용하기 전
        List<Teacher> likeAlgorithmTeachers = new ArrayList<>();
        for (int i = 0; i < teachers.size(); i++) {
            if(teachers.get(i).isLikeAlgorithm()){
                likeAlgorithmTeachers.add(teachers.get(i));
            }
        }

        //.filter() → 이 안에는 predicate.test()가 생략 되어 있습니다. true면 포함시키고 false이면 넘어갑니다.


        //filter만 사용했을 때
        List<Teacher> likeSpringbootTeachers = teachers.stream()
                .filter(teacher -> teacher.isLikeSpringboot() == true)
                .collect(Collectors.toList());
        for(Teacher teacher: likeSpringbootTeachers) {
            System.out.println(teacher.getName());
        }

        //.map() -> 타입을 Collection 단위로(ex List) 바꿀 수 있습니다.

        //조금더 개선 filter+map 사용
        System.out.println("---SpringBoot이 true이신 분들 map--");
        List<String> likeSpringBootTeachers = teachers.stream()
                .filter(teacher -> teacher.isLikeSpringboot() == true)
                .map(teacher -> teacher.getName())
                .collect(Collectors.toList());
        //map으로 내가 반환하고자하는 것(이름)까지 가져와서 리스트에 넣었기 때문에 for-each로 바로 출력 가능
        for (String teacherName : likeSpringBootTeachers) {
            System.out.println(teacherName);
        }


        Optional<Teacher> optionalTeacher = Optional.of(kyeongrok);
        optionalTeacher.orElseThrow(()-> new RuntimeException());

        List<String> likeSpringBootTeachers1 = teachers.stream()
                .filter(item -> item.isLikeSpringboot() == true)
                .map(item -> item.getName())
                .collect(Collectors.toList());

        //::의 사용 -> .filter(Teacher::isLikeSpringBoot) == .filter(teacher -> teacher.isLikeSpringBoot() == true)
        List<Integer> digitsOfNames = teachers.stream()
                .filter(Teacher::isLikeSpringboot)
                .map(Teacher::cntNameDigit)
                .collect(Collectors.toList());
        System.out.println(digitsOfNames);

        //-------------.map의 3단계 활용법-------------
        //.map(teacher -> teacher.getName().length())  // 1단계 map에서 처리
        //.map(teacher -> teacher.cntNameDigit())      // 2단계 함수 내장
        //.map(Teacher::cntNameDigit)                  // 3단계 ::문법 적용
        // ---> 뒤로 갈 수록 쓰기는 편하지만 이해 하기 어려움 하지만 이해 했을 때는 좋습니다.

    }

    @Test
    void reduce() {

        List<Teacher> teachers = new ArrayList<>();
        Teacher kyeongrok = new Teacher("김경록", true, true);
        Teacher kyeonghwan = new Teacher("고경환", true, false);
        Teacher sujin = new Teacher("김수진", false, true);
        Teacher sohyun = new Teacher("강소현", true, true);

        teachers.add(kyeongrok);
        teachers.add(kyeonghwan);
        teachers.add(sujin);
        teachers.add(sohyun);

        String[] list = {"1", "2", "3"};
        List<Integer> nums = Arrays.stream(list)
                .map(strNum-> Integer.parseInt(strNum))
                .collect(Collectors.toList());

        int sum = 0;
        for (int i=0; i<nums.size(); i++) {
            sum += nums.get(i);
        }
        System.out.println(sum);

        //.reduce -> Collection을 연산해서 한개의 값으로 만들어주는 연산
        int reduceSum = Arrays.stream(list)
                .map(strNum -> Integer.parseInt(strNum))
                .reduce(0, (a,b) -> a+b);
        System.out.println("reduceSum:" + reduceSum);


        //------algorithm 좋아하는 사람 수 구하기 ---
        //filter+map+reduce 사용
        int cntOfAlgorithm = teachers.stream()
                .filter(Teacher::isLikeAlgorithm)
                .map(teacher -> 1)
                .reduce(0, (a,b) -> a+b);
        System.out.println("reduceSum:" + reduceSum);

        //map+reduce 사용
        Integer likeSpringBootTeachers = teachers.stream()
                .map((teacher)->teacher.isLikeSpringboot() ? 1 : 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println(likeSpringBootTeachers);
    }

    @Test
    void optionalTest() {
        // DB에서 select되어 값이 있는 상태
        Optional<Teacher> optionalTeacher = Optional.of(new Teacher("김경록", true, true));
        Optional<Teacher> emptyTeacher = Optional.empty();

        List<Teacher> teachers = new ArrayList<>();
        teachers.size(); // --> 값이 없으면 0

        // get
        Optional<Teacher> optionalTeacher3 = Optional.of(new Teacher("김경록", true, true));
        Teacher teacher = optionalTeacher3.get(); //값이 있는 경우

        // 값이 없는 경우 get
        Optional<Teacher> emptyTeacher2 = Optional.empty();
        emptyTeacher2.get();
        emptyTeacher2.orElseThrow(RuntimeException::new);
        Teacher teacher1 = emptyTeacher2.orElseThrow(() -> new RuntimeException());


        // 값이 있는 경우 무언가 처리 하고 싶을 때
        Optional<Teacher> optionalTeacher4 = Optional.of(new Teacher("김경록", true, true));
        optionalTeacher4.ifPresent(sth -> {
            throw new RuntimeException(sth.getName()); // throw new HospitalReviewAppException(ErrorCode.DUPLICATED_USER_NAME, String.format("UserName:%s", request.getUserName()));
        });

        // .ofNullable, orElse()
        Optional<Teacher> optionalTeacher5 = Optional.of(new Teacher(null, true, true));
        String name = Optional.ofNullable(optionalTeacher5.get().getName()).orElse("이름이 없습니다.");
        System.out.println(name);
    }

}
