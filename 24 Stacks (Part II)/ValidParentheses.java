import java.util.*;

public class ValidParentheses {
    public static boolean validParentheses(String str) {
        Stack<Character> s = new Stack<>();
        // push char into stack;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {

                if (s.isEmpty()) {
                    return false;
                }

                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();

                } else {
                    return false;
                }
            }
        }

        if (!s.isEmpty()) {
            return false;
        }

        System.out.println(s);
        return true;
    }

    public static void main(String[] args) {
        String s = "(({[]}())";

        System.out.println(validParentheses(s));
    }
}
