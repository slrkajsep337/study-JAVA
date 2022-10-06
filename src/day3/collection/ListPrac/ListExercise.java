package day3.collection.ListPrac;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {


    //외부에서 접근할 수 없도록 멤버변수는 private으로 선언
    private List<String> students = new ArrayList<>();

    //위에서 선언한 students를 초기화해주는 생성자
    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("가나다");
    }

    //private으로 선언된 students에 접근하기 위한 method 생성
    public List<String> getSutdents() {
        return this.students;
    }

}
