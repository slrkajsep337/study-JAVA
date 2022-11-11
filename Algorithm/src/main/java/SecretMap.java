import java.util.ArrayList;
import java.util.List;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        List<String> temp = new ArrayList<>();

//        String binaryString = Integer.toBinaryString(i);

        for(int i=0; i<n; i++) {

        }



        return answer;
    }

    public static void main(String[] args) {

        int num = 9;
        String binarynum = "";

        //2진수 구하기
        while(true) {
            binarynum += String.valueOf(num%2);
            num /= 2;
            if (num==1) {
                binarynum += "1";
                break;
            }
        }

        for(int i=binarynum.length()-1; i>-1; i--) {
            System.out.print(binarynum.charAt(i));
        }

    }
}
