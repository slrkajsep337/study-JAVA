import java.util.ArrayList;
import java.util.List;

public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        List<String> temp = new ArrayList<>();
        String temp1;
        String temp2;
        String answertemp = "";
        int sum=0;

        for(int i=0; i<n; i++) {
            temp1 = Integer.toBinaryString(arr1[i]);
            temp2 = Integer.toBinaryString(arr2[i]);
            sum = Integer.parseInt(temp1)+Integer.parseInt(temp2);
            for(int j=0; j<n; j++) {
                if(sum%10>0) answertemp = "#"+answertemp;
                else answertemp = " "+answertemp;
                sum /= 10;
            }
            answer[i] = answertemp;
            answertemp = "";
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
//            System.out.print(binarynum.charAt(i));
        }




    }
}
