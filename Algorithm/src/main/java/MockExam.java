import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {
        public ArrayList<Integer> solution(int[] answers) {
            ArrayList<Integer> answer = new ArrayList<Integer>();
            int[] stdnt = {0, 0, 0};
            int[] stu1answer = {1, 2, 3, 4, 5};
            int[] stu2answer = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] stu3answer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            for (int i=0; i<answers.length; i++) {
                if (stu1answer[i % stu1answer.length] == answers[i]) {
                    stdnt[0] += 1;
                }
                if (stu2answer[i%stu2answer.length] == answers[i]) {
                    stdnt[1] += 1;
                }
                if (stu3answer[i%stu3answer.length] == answers[i]) {
                    stdnt[2] += 1;
                }
            }

            int max = 0;
            for (int s: stdnt) {
                if(s > max) max = s;
            }

            int cnt = 0;
            for (int i=0; i<3; i++) {
                if (stdnt[i]==max) {
                    answer.add(i+1);
                    cnt += 1;
                }
            }

            return answer;
        }

        public static void main(String[] args) {

            MockExam me = new MockExam();
            int[] answers = {1,2,3,4,5};
            for (int s: me.solution(answers)) {
                System.out.println(s);
            }
    }




}
