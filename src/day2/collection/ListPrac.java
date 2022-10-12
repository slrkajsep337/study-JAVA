package day2.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPrac {

    //다른클래스로부터 접근을 막기위해 private으로 선언
    //students 어레이리스트 생성
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();

    Names names = new Names();
    public ListPrac() {

        names.getName(students);
        this.studentObjs = names.getStudentObjs();
    }

    // 멋사 2기 학생의 이름이 들어있는 list를 return 하는 method
    public List<String> getStudentList() {
        return this.students;
    }
}