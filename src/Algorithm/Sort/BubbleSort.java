package Algorithm.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, 5, 2, 7, 1, 10, 8, 4, 6};
        int temp;

        for(int i=arr.length-1; i>0; i--) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int a: arr) {
            System.out.print(a);
        }
    }
}
