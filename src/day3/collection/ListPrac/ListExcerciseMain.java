package day3.collection.ListPrac;

import java.util.ArrayList;
import java.util.List;

public class ListExcerciseMain {
    public static void main(String[] args) {

        ListExercise listExercise = new ListExercise();
        List<String> students = listExercise.getSutdents();


        for (String student : students) { //listExcercise.getStudents();
            System.out.println(student);
        }

        System.out.println(students.size());
    }


}
