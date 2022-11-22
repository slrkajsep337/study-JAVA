import java.util.ArrayList;
import java.util.List;

public class RecursionPrac {
    static int listsum(List<Integer> nums) {
        if(nums.isEmpty()) return 0;
        return nums.remove(nums.size() - 1) + listsum(nums);
    }

    static int arrsum(int[] arr, int idx) {
        if(arr.length == idx) return 0;
        // idx + 1을 해서 탈출조건에 갈수 있게 처리한다
        return arr[idx] + arrsum(arr, idx + 1);
    }



    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        System.out.println(listsum(nums));

        int[] arr = new int[]{7, 3, 2, 9};
        int r = arrsum(arr, 0);
        System.out.println(r);
    }
}
