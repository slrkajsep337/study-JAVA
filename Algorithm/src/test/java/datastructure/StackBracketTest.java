package datastructure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        StackBracket sb = new StackBracket();
        assertTrue(sb.solution("()()"));
//        assertTrue(sb.solution("(())()"));
//        assertTrue(sb.solution(")()("));
//        assertTrue(sb.solution("(()("));

    }

}