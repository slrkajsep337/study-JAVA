import java.util.ArrayList;

public class QuickSort {


    public int QuickSort(int[] arr) {

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int pivot = arr.length/2;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]<arr[pivot]) left.add(arr[i]);
            else if (arr[i]>=arr[pivot]) right.add(arr[i]);
        }

    }

    public static void main(String[] args) {

        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};



    }
}
