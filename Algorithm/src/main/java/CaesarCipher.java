public class CaesarCipher {

    //32 - 공백

    public String solution(String s, int n) {
        String answer = "";
        char temp;

        for(char c: s.toCharArray()) {
            if ((int) c == 32) {
                answer += ' ';
            } else if ('a' <= c && c <= 'z') {
                temp = (char) (c + n);
                if (temp > 'z') temp = (char) (c + n - 26);
                answer += temp;
            } else if ('A' <= c && c <= 'Z') {
                temp = (char) (c + n);
                if (temp > 'Z') temp = (char) (c + n - 26);
                answer += temp;
            }

        }
            return answer;
    }
    public static void main(String[] args) {

    }

}

