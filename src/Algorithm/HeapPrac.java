package Algorithm;

import java.util.Arrays;

public class HeapPrac {

    public static int[] makeHeap(int[] arr, int parentIdx, int arrSize) {
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        System.out.println("->"+Arrays.toString(arr));
        // 왼쪽이 parent 보다 클 때  greateridx=leftIdx 6 7 5 --> 7 6 5
        if (leftIdx < arrSize && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        //오른쪽이 greater 보다 클 때
        if (rightIdx < arrSize && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        // swap
        if (parentIdx != greaterIdx) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = temp;
            makeHeap(arr, greaterIdx, arrSize);
        }

        return arr;
    }

        public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 5, 8, 3, 2, 4, 6, 7, 1};
//        for (int j = (arr.length-2) / 2; j >= 0 ; j--) {
//            //부모노드 idx 정해주는 for문
//            arr = makeHeap(arr, j, arr.length);
//            System.out.println("->"+Arrays.toString(arr));
//        }
        // 정렬,
        for (int i = arr.length - 1; i > 0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            arr = makeHeap(arr, 0, i);
            System.out.println(Arrays.toString(arr));
        }

    }
}
