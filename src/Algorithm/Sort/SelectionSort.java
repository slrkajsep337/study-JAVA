package Algorithm.Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, 5, 2, 7, 1, 10, 8, 4, 6};
        int min;
        int temp;
        int tidx = 0;

        for(int i=0; i<arr.length-1; i++) {
            min = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                if(min>arr[j]) {
                    min = arr[j];
                    tidx = j;
                }
            }
            if(arr[i]==min) {
                break;
            }
            temp = arr[i];
            arr[i] = arr[tidx];
            arr[tidx] = temp;
        }

        for(int a: arr) {
            System.out.print(a);
        }
    }
}
