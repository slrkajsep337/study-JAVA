package day3.collection.ListPrac;

import java.util.ArrayList;
import java.util.List;

public class ListExcerciseMain {
    public static void main(String[] args) {

        //객체 생성
        ListExercise listExercise = new ListExercise();
        List<String> students = listExercise.getSutdents();

        //for-each문으로 어레이리스트의 값을 하나씩 꺼내 출력
        for (String student : students) { //listExcercise.getStudents();
            System.out.println(student);
        }

        //students 리스트의 사이즈 반환
        System.out.println(students.size());
    }


}
