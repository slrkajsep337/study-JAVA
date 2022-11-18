public class CaesarCipher {

    //32 - 공백

    public String solution(String s, int n) {
        String answer = "";
        char temp;

        for(char c: s.toCharArray()) {
            if((int)c==32) {
                answer += ' ';
            } else {
                if ((char)(c+n)>='z' || ('a'>(char)(c+n) && (char)(c+n)>='Z')){
                    temp = (char)(c+n-26);
                } else {
                    temp = (char)(c+n);
                }
                answer += temp;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        char temp;
        temp = (char)('z');

        System.out.println((char)(temp+1-26));

    }

}

