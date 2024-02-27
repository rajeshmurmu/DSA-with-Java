import java.util.*;
import java.util.LinkedList;

public class NonRepeatingLetter {

    public static void nonRepeatingChar(String str) {
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            // 65-66 =>1;
            char idx = str.charAt(i);
            q.add(idx);
            freq[idx - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }

        }

        System.out.println();

    }

    public static void main(String[] args) {
        String str = "aabccxb";

        nonRepeatingChar(str);
    }
}
