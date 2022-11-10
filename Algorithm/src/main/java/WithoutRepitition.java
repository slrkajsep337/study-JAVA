import java.lang.reflect.Array;
import java.util.*;

public class WithoutRepitition {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                arr2.add(arr[i]);
            }
        }

        for(int a: arr2) {
            System.out.print(a+" ");
        }

    }
}
