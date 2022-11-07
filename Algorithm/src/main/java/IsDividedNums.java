import java.util.ArrayList;
import java.util.List;

public class IsDividedNums {

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int a: arr) {
            if(a%divisor == 0) {
                answer.add(a);
            }
        }

        if (answer.size()==0) answer.add(-1);
        else {
            for ()
        }




        return answer;
    }


    public static void main(String[] args) {

    }
}
