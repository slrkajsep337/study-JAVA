package Algorithm.CodeUp100;

import java.util.Scanner;

public class CodeUp2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int startidx = 0;
        int endidx = n;
        int mididx;
        int answer = -1;


        while (startidx<=endidx) {
            mididx = (startidx+endidx)/2;
            if(arr[mididx]<s) startidx = mididx+1;
            else if(arr[mididx]>s) endidx = mididx-1;
            else if(mididx==0) {
                answer = -1;
                break;
            }
            else {
                answer = mididx+1;
                break;
            }
        }

        System.out.println(answer);
    }
}
