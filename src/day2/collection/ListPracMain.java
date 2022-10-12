package day2.collection;

import java.util.List;
//목표
//리스트를 생성하고 90명의 이름을 모두 넣는다
//리스트를 생성하고 우리반 90명의 이름,반,깃주소 3가지를 student에 넣는다
public class ListPracMain {
    public static void main(String[] args) {
        ListPrac listPrac = new ListPrac();
        List<String> students = listPrac.getStudentList();

        for (String student: students) {
            System.out.println(student);
        }

        // 리스트이름.size(0) : 리스트의 크기 반환
        System.out.println(students.size());


    }
}
