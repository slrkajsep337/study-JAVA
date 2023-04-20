package boj.backtracking;

import java.util.*;
import java.io.*;
public class NandM1 {
    static int n, m;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    static void recursion(int k) {
        if(k==m) {
            for(int s : selected) sb.append(s).append(' ');
            sb.append('\n');
        } else {
            for(int i=1; i<n+1; i++) {
                boolean isUsed = false;
                for (int s : selected) {
                    if (s == i) {
                        isUsed = true;
                        break;
                    }
                }
                if (!isUsed) {
                    selected[k] = i;
                    recursion(k + 1);
                    selected[k] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m];

        recursion(0);
        System.out.println(sb.toString());


    }
}
