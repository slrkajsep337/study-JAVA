import java.util.ArrayList;

public class FindingPrimenum {

    public static void main(String[] args) {

        int[] nums = {13, 17, 19, 23};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean check = true;

//        for(int n: nums) {
//            for(int i=2; i<n; i++) {
//                if(n%i == 0) {
//                    check = false;
//                    break;
//                }
//            }
//            if(check == true) {
//                arr.add(n);
//            }
//        }

        for(int n: nums) {
            for(int i=2; i<n/2; i++) {
                if(n%i == 0) {
                    check = false;
                    break;
                }
            }
            if(check == true) {
                arr.add(n);
            }
        }

        for(int a: arr) {
            System.out.println(a);
        }


    }

}
