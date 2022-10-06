package day3.collection.ListPrac;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students = new ArrayList<>();

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("가나다");
    }

    public List<String> getSutdents() {
        return this.students;
    }

}
