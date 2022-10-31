public class MockExam {

    class Solution {
        public int[] solution(int[] answers) {
            int[] answer = {};
            int[] stu1answer = {1, 2, 3, 4, 5};
            int[] stu2answer = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] stu3answer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int stu1 = 0;
            int stu2 = 0;
            int stu3 = 0;

            for (int i=0; i<answer.length; i++) {
                if (i>stu1answer.length){
                    int j = i%stu1answer.length;
                    if (stu1answer[j] == answer[i]){
                        stu1 += 1;
                    }
                }
            }

            for (int i=0; i<answer.length; i++) {
                if (i>stu2answer.length){
                    int j = i%stu1answer.length;
                    if (stu2answer[j] == answer[i]){
                        stu2 += 1;
                    }
                }
            }

            for (int i=0; i<answer.length; i++) {
                if (i>stu3answer.length){
                    int j = i%stu3answer.length;
                    if (stu3answer[j] == answer[i]){
                        stu3 += 1;
                    }
                }
            }

            return answer;
        }
    }




}
