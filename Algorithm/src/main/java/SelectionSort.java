public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int min;
        int minidx;
        int temp;

        for(int i=0; i<arr.length-1; i++) {
            min = arr[i];
            minidx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<min) {
                    min = arr[j];
                    minidx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }

        for(int a: arr) {
            System.out.print(a+" ");
        }

    }
}
