public class CountsOfPnY {
    static boolean solution(String s) {
        boolean answer = true;
        int pcnt = 0;
        int ycnt = 0;

        for(char c: s.toCharArray()) {
            if (c=='p' || c=='P') pcnt += 1;
            else if (c=='y' || c=='Y') ycnt += 1;
        }

        if(pcnt != ycnt) answer = false;

        return answer;
    }

    public static void main(String[] args) {

    }

}
