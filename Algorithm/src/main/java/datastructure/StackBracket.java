package datastructure;

import java.util.Stack;

public class StackBracket {
    //핵심 로직, 여는 괄호와 닫는괄호가 연속해서 나오면 string에서 빼주기
    public boolean solution(String s)
    //boolean 은 t/F 만 반환해서 메모리를 적게 사용, 그래서 boolean 을 사용할 수 있는 경우에는 boolean을 사용한다
    {

//        System.out.println(s);
//        //stack 사용X 1번 -> test는 통과하지만 시간 초과가 남.
//        while(s.indexOf("()") >= 0) {
//            s = s.replace("()", "");
//        }
//        return s.length() == 0;

//        stack 사용x 2번 -> 역시 시간초과
//        while(s.indexOf("()") >= 0) {
//            String[] splitted = s.split("\\(\\)");
//            s = String.join("", splitted);
//        }
//                return s.length() == 0;

        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if('(' == s.charAt(i)) {
                st.push(s.charAt(i));
                System.out.println(st.size());
            } else if (')' == s.charAt(i)) {
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();




    }
}
