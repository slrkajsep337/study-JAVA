package boj.backtracking;

import java.util.*;
import java.io.*;

public class PutOperator {
//만들 수 있는 식들 중 최대/최소 값 구하기

    static int n;
    static int[] arr;
    static int[] operator;
    static long min = 1000000000, max = -1000000000;

    static int calculator(int operand1, int operator, int operand2) {
        // value, order[i], num[i+1]
        if (operator == 0) // +
            return operand1 + operand2;
        else if (operator == 1) // -
            return operand1 - operand2;
        else if (operator == 2) // *
            return operand1 * operand2;
        else // /
            return operand1 / operand2;
    }

    static void recursion(int k, int value) {
        if(k==n-1) {
            if(value<min) min = value;
            if(value>max) max = value;
        } else {
            for(int i=0; i<4; i++) {
                if(operator[i]>0) {
                    operator[i] -= 1;
//                    if(i==0) value += arr[k+1];
//                    else if(i==1) value -= arr[k+1];
//                    else if(i==2) value *= arr[k+1];
//                    else value /= arr[k+1];
//                    recursion(k+1, value);
                    recursion(k + 1, calculator(value, i, arr[k + 1]));
                    operator[i] += 1;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        operator = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        recursion(0, arr[0]);
        System.out.println(max);
        System.out.println(min);


    }
}