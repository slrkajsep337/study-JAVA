import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IsDividedNums {

    public static List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int a: arr) {
            if(a%divisor == 0) {
                answer.add(a);
            }
        }

        if (answer.size()==0) answer.add(-1);
        Collections.sort(answer);


        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(solution(arr, divisor));
    }
}
