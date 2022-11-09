public class SelectionSort2 {
    public static void main(String[] args) {
        //내림차순 정렬
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int maxidx;
        int temp;

        for(int i=0; i<arr.length-1; i++) {
            maxidx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]>arr[maxidx]) {
                    maxidx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx] = temp;
        }

        for(int a: arr) {
            System.out.print(a+" ");
        }
    }

}
