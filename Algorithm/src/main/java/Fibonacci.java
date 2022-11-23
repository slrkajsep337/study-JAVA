import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);

        for (int i=0; i<num+1; i++) {
            arr.add(arr.get(i)+arr.get(i+1));
        }

        for (int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }

}
