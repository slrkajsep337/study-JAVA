package collection;

import java.util.List;

public class ListPracMain {
    public static void main(String[] args) {
        ListPrac listPrac = new ListPrac();
        List<String> students = listPrac.getStudentList();

        for (String student: students) {
            System.out.println(student);
        }

        System.out.println(students.size());


    }
}
