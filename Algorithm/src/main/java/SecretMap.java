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
//        for(int i=0; i<n; i++) {
//            temp1 = Integer.toBinaryString(arr1[i]);
//            temp2 = Integer.toBinaryString(arr2[i]);
//            sum = Integer.parseInt(temp1)+Integer.parseInt(temp2);
            // 비트연산 사용
//            sum = Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i]));
//            for(int j=0; j<n; j++) {
//                if(sum%10>0) answertemp = "#"+answertemp;
//                else answertemp = " "+answertemp;
//                sum /= 10;
//            }
//            answer[i] = answertemp;
//            answertemp = "";
//        }

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1","#").replace("0", " ");
            // 자릿수 맞춰주는 연산
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
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
